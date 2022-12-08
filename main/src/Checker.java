
public class Checker {

    public static void evalClientData(Client client) throws InputException {
        if (client.loan <= 0) {
            throw new InputException("Loan input is invalid");
        }
        if (client.monthPay <= 0) {
            throw new InputException("Month pay input is invalid");
        }
        if (client.percent <= 0) {
            throw new InputException("Percent input is invalid");
        }
    }
}
