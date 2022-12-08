import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String argsString = scanner.nextLine();
            String[] arguments = argsString.split(" ");

            if (arguments.length != 4) {
                throw new InputException("You must input 4 arguments\nUsage:\nloan monthPay percent clientType");
            }
            Client client = new Client(arguments[0], arguments[1], arguments[2], arguments[3]);
            Checker.evalClientData(client);
            Calculator.calcOverpay(client);
        }
    }
}