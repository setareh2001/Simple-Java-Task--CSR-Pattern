package main.java.exception;

public class PasswordLengthException extends RuntimeException{

    private final String message;

    public PasswordLengthException(String m){
        this.message = m;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
