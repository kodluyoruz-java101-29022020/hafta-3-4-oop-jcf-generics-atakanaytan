package firstQuestion.exception;

public class InvalidAuthenticationException extends Exception{

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public InvalidAuthenticationException(String message) {
        this.message = message;
    }

}
