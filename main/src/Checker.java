
public class Checker {

    public static void evalClientData(Client client) throws Exit {
        if (client.loan <= 0) {
            throw new Exit("Client loan is invalid", "INVALID_LOAN");
        }
        if (client.monthPay <= 0) {
            throw new Exit("Month pay is invalid", "INVALID_MONTH_PAY");
        }
        if (client.percent <= 0) {
            throw new Exit("Percent is invalid", "INVALID_PERCENT");
        }
    }
}
