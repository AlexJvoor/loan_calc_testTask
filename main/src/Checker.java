import java.io.IOException;

public class Checker {

    public static void evalClientData(Client client) throws IOException {
        if (client.loan <= 0) {
            throw new IOException("Loan input is invalid");
        }
        if (client.monthPay <= 0) {
            throw new IOException("Month pay input is invalid");
        }
        if (client.percent <= 0) {
            throw new IOException("Percent input is invalid");
        }
    }
}
