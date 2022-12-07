
public class Checker {

    public static void evalClientData(Client client) throws Exit {
        if (client.loan <= 0) {
            throw new Exit("InvalidLoanException");
        }
        if (client.monthPay <= 0) {
            throw new Exit("InvalidMonthPayException");
        }
        if (client.percent <= 0) {
            throw new Exit("InvalidPercentException");
        }
    }
}
