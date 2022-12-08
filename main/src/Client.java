public class Client {
    double loan;
    double monthPay;
    double percent;
    boolean human;

    Client(String loanStr, String monthPayStr, String percentStr, String clientType) throws InputException {
        monthPay = Double.parseDouble(monthPayStr);
        percent = Double.parseDouble(percentStr) / 100;
        loan = Double.parseDouble(loanStr);
        switch (clientType) {
            case "human" -> human = true;
            case "business" -> human = false;
            default -> throw new InputException("Unknown client type");
        }
    }
}
