public class Calculations {
    public static void calcOverpay(Client client) {
        double overpay = -client.loan;
        double currLoan = client.loan;

        if (client.human)
            currLoan += client.loan * client.percent;
        while (currLoan > 0) {
            for (int i = 0; i < 12; i++) {
                if (currLoan <= client.monthPay) {
                    overpay += currLoan;
                    currLoan = 0;
                    break;
                }
                overpay += client.monthPay;
                currLoan -= client.monthPay;
            }
            if (currLoan >= client.loan)
                Exit.exit("Loan can not be paid with current input");
            currLoan += currLoan * client.percent;
        }
        System.out.println(overpay);
    }
}
