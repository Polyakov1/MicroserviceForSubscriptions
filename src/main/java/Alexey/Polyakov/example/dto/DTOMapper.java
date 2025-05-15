package Alexey.Polyakov.example.dto;

import Alexey.Polyakov.example.model.User;
import Alexey.Polyakov.example.model.Subscription;

public interface DTOMapper {
    UserResponseDTO toUserResponseDTO(User user);
    SubscriptionResponseDTO toSubscriptionResponseDTO(Subscription subscription);
    User toUser(UserDTO userDTO);
    Subscription toSubscription(SubscriptionDTO subscriptionDTO);
}