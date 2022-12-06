
public class Evaluations {

    public static void evalClientData(Client client) throws ExitException{
        if (client.loan <= 0) {
            throw new ExitException("Client loan is invalid", "INVALID_LOAN");
        }
        if (client.monthPay <= 0) {
            throw new ExitException("Month pay is invalid", "INVALID_MONTH_PAY");
        }
        if (client.percent <= 0) {
            throw new ExitException("Percent is invalid", "INVALID_PERCENT");
        }
    }
}
