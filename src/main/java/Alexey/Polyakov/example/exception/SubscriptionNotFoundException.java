package Alexey.Polyakov.example.exception;


public class SubscriptionNotFoundException extends NotFoundException {
    public SubscriptionNotFoundException(Long subscriptionId) {
        super("Subscription", subscriptionId.toString());
    }
}