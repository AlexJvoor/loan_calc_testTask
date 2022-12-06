import java.io.IOException;

public class Exit extends IOException {

    private final String errorCode;
    public Exit(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode(){
        return this.errorCode;
    }
}
