import java.io.IOException;

public class Exit extends IOException {
    public Exit(String message) {
        super(message);
    }
}
