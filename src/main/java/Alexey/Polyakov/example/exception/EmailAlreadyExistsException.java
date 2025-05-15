package Alexey.Polyakov.example.exception;

import org.springframework.http.HttpStatus;

public class EmailAlreadyExistsException extends BaseException {
    public EmailAlreadyExistsException(String email) {
        super(
                String.format("Email '%s' is already in use", email),
                HttpStatus.CONFLICT,
                "EMAIL_ALREADY_EXISTS"
        );
    }
}