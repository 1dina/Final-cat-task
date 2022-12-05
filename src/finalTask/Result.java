package finalTask;

public class Result {
    private boolean isValid = false;
    private String message;

    void setMessage(String message) {
        this.message = message;
    }

    String getMessage() {

        return message;
    }

    void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    boolean getValid() {
        return isValid;
    }

}
