package Alexey.Polyakov.example.controller;



import Alexey.Polyakov.example.dto.SubscriptionDTO;
import Alexey.Polyakov.example.model.Subscription;
import Alexey.Polyakov.example.service.SubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users/{userId}/subscriptions")
public class SubscriptionController extends BaseController {

    private final SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @PostMapping
    public ResponseEntity<Subscription> addSubscription(
            @PathVariable Long userId,
            @Valid @RequestBody SubscriptionDTO subscriptionDTO) {
        return ok(subscriptionService.addSubscription(userId, subscriptionDTO));
    }

    @GetMapping
    public ResponseEntity<List<Subscription>> getUserSubscriptions(@PathVariable Long userId) {
        return ok(subscriptionService.getUserSubscriptions(userId));
    }

    @DeleteMapping("/{subscriptionId}")
    public ResponseEntity<Void> deleteSubscription(
            @PathVariable Long userId,
            @PathVariable Long subscriptionId) {
        subscriptionService.deleteSubscription(userId, subscriptionId);
        return noContent();
    }
}

