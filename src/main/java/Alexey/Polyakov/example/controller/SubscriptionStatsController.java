package Alexey.Polyakov.example.controller;

import Alexey.Polyakov.example.service.SubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subscriptions")
public class SubscriptionStatsController extends BaseController {

    private final SubscriptionService subscriptionService;

    public SubscriptionStatsController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @GetMapping("/top")
    public ResponseEntity<List<Object[]>> getTopSubscriptions() {
        return ok(subscriptionService.getTop3PopularSubscriptions());
    }
}