package Alexey.Polyakov.example.controller;

import org.springframework.http.ResponseEntity;

public abstract class BaseController {
    protected <T> ResponseEntity<T> ok(T body) {
        return ResponseEntity.ok(body);
    }

    protected ResponseEntity<Void> noContent() {
        return ResponseEntity.noContent().build();
    }

    protected ResponseEntity<Void> notFound() {
        return ResponseEntity.notFound().build();
    }
}