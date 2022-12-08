
public class Checker {

    public static void evalClientData(Client client) throws InputException {
        if (client.loan <= 0) {
            throw new InputException("InvalidLoanException");
        }
        if (client.monthPay <= 0) {
            throw new InputException("InvalidMonthPayException");
        }
        if (client.percent <= 0) {
            throw new InputException("InvalidPercentException");
        }
    }
}
