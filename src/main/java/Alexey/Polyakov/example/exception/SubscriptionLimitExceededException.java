package Alexey.Polyakov.example.exception;

import org.springframework.http.HttpStatus;

public class SubscriptionLimitExceededException extends BaseException {
    public SubscriptionLimitExceededException(int limit) {
        super(
                String.format("Maximum subscription limit (%d) exceeded", limit),
                HttpStatus.FORBIDDEN,
                "SUBSCRIPTION_LIMIT_EXCEEDED"
        );
    }
}