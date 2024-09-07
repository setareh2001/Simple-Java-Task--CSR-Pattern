package main.java.exception;

public class EmailAddressDuplicateExpection extends RuntimeException{

    private final String message;

    public EmailAddressDuplicateExpection(String m){
        this.message = m;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
