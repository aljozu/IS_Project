package com.example.restbackend.custom_exception;

public class CustomException extends RuntimeException {
    public CustomException(String exception) {
        super(exception);
    }
}