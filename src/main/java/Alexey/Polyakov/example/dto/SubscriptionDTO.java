package Alexey.Polyakov.example.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@SuperBuilder
public class SubscriptionDTO extends BaseDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "Service name is mandatory")
    private String serviceName;

    @NotBlank(message = "Plan is mandatory")
    private String plan;

    @NotNull(message = "Price is mandatory")
    @Positive(message = "Price must be positive")
    private Double price;
}