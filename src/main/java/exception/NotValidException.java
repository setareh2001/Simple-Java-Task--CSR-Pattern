package main.java.exception;

public class NotValidException extends RuntimeException {

    private final String message;

    public NotValidException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

