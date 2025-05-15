package Alexey.Polyakov.example.exception;

import org.springframework.http.HttpStatus;

public abstract class NotFoundException extends BaseException {
    public NotFoundException(String resourceName, String identifier) {
        super(
                String.format("%s not found with identifier: %s", resourceName, identifier),
                HttpStatus.NOT_FOUND,
                "RESOURCE_NOT_FOUND"
        );
    }
}