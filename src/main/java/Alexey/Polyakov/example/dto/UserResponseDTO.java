package Alexey.Polyakov.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@SuperBuilder
public class UserResponseDTO extends UserDTO {
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<SubscriptionResponseDTO> subscriptions;
    private Long id;
    private String name;
    private String email;
}