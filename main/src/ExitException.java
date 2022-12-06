import java.io.IOException;

public class ExitException extends IOException {

    private final String errorCode;
    public ExitException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode(){
        return this.errorCode;
    }
}
