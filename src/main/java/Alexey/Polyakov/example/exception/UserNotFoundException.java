package Alexey.Polyakov.example.exception;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException(Long userId) {
        super("User", userId.toString());
    }
}