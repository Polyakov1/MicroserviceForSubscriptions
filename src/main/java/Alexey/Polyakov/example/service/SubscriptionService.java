package Alexey.Polyakov.example.service;



import Alexey.Polyakov.example.dto.SubscriptionDTO;
import Alexey.Polyakov.example.model.Subscription;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SubscriptionService {
    Subscription addSubscription(Long userId, SubscriptionDTO subscriptionDTO);
    List<Subscription> getUserSubscriptions(Long userId);
    void deleteSubscription(Long userId, Long subscriptionId);
    List<Object[]> getTop3PopularSubscriptions();
}