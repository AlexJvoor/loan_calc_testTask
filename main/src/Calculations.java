public class Calculations {
    public static void calcOverpay(Client client) throws ExitException{
        double overpay = -client.loan;
        double currLoan = client.loan;

        if (client.human) {
            currLoan += client.loan * client.percent;
        }
        while (currLoan > 0) {
            double yearPay = client.monthPay * 12;
            if (currLoan <= yearPay) {
                    overpay += currLoan;
                    currLoan = 0;
                }
            else {
                overpay += yearPay;
                currLoan -= yearPay;
            }
            if (currLoan >= client.loan) {
                throw new ExitException("", "UNPAYABLE_LOAN");
            }
            currLoan += currLoan * client.percent;
        }
        System.out.println(overpay);
    }
}
