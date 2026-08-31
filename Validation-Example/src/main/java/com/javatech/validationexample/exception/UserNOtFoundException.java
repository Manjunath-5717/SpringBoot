package com.javatech.validationexample.exception;

public class UserNOtFoundException extends RuntimeException {

    public UserNOtFoundException(String message) {
        super(message);
    }
}