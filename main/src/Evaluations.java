
public class Evaluations {

    public static void evalClientData(Client client) {
        if (client.loan <= 0)
            Exit.exit("Client loan is invalid");
        if (client.monthPay <= 0)
            Exit.exit("Client monthPay is invalid");
        if (client.percent <= 0)
            Exit.exit("Client percent is invalid");
    }
}
