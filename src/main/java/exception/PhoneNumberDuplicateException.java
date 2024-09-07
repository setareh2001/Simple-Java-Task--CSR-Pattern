package main.java.exception;

public class PhoneNumberDuplicateException extends RuntimeException {

    private final String message;

    public PhoneNumberDuplicateException(String m){
        this.message = m;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
