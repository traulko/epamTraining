package com.traulko.day1.exception;

public class IncorrectValueException extends Exception {
    public IncorrectValueException(String message) {
        super(message);
    }

    public IncorrectValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
