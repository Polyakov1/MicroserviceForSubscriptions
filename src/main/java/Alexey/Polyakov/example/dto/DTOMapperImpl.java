package Alexey.Polyakov.example.dto;



import Alexey.Polyakov.example.model.User;
import Alexey.Polyakov.example.model.Subscription;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class DTOMapperImpl implements DTOMapper {

    @Override
    public UserResponseDTO toUserResponseDTO(User user) {
        return UserResponseDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .subscriptions(user.getSubscriptions() != null ?
                        user.getSubscriptions().stream()
                                .map(this::toSubscriptionResponseDTO)
                                .collect(Collectors.toList()) : null)
                .build();
    }

    @Override
    public SubscriptionResponseDTO toSubscriptionResponseDTO(Subscription subscription) {
        return SubscriptionResponseDTO.builder()
                .id(subscription.getId())
                .serviceName(subscription.getServiceName())
                .plan(subscription.getPlan())
                .price(subscription.getPrice())
                .createdAt(subscription.getCreatedAt())
                .updatedAt(subscription.getUpdatedAt())
                .userId(subscription.getUser() != null ? subscription.getUser().getId() : null)
                .build();
    }

    @Override
    public User toUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        return user;
    }

    @Override
    public Subscription toSubscription(SubscriptionDTO subscriptionDTO) {
        Subscription subscription = new Subscription();
        subscription.setServiceName(subscriptionDTO.getServiceName());
        subscription.setPlan(subscriptionDTO.getPlan());
        subscription.setPrice(subscriptionDTO.getPrice());
        return subscription;
    }
}