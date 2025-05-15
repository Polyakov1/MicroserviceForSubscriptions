package Alexey.Polyakov.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder

public class SubscriptionResponseDTO extends SubscriptionDTO {
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long userId;

}