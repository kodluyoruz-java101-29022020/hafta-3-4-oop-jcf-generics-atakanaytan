package firstQuestion.account.loginStatus;

public enum AuthenticationStatus {
    SUCCESSFUL(true, "Succesful Login"), FAIL(false, "Given email address or password does not match with users credentials. Please try again.");

    private final boolean status;
    private final String message;

    AuthenticationStatus(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public boolean isLogin() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
