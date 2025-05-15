package Alexey.Polyakov.example.model;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "subscriptions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Subscription extends BaseEntity {


    @Column(nullable = false, length = 50)
    private String serviceName;

    @Column(nullable = false, length = 50)
    private String plan;

    @Column(nullable = false)
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}