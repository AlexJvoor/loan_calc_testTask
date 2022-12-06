import java.io.Console;

public class Main {
    public static void main(String[] args) throws ExitException{
        Console console = System.console();
        if (console != null) {
            while (true) {
                try {
                    String argsString = console.readLine();
                    String[] arguments = argsString.split(" ");
                    if (arguments.length != 4)
                        throw new ExitException("Usage:\nloan, monthPay, percent, clientType", "SYNTAX_ERROR");
                    Client client = new Client(arguments[0], arguments[1], arguments[2], arguments[3]);
                    Evaluations.evalClientData(client);
                    Calculations.calcOverpay(client);
                }
                catch(ExitException e) {
                    processErrorByCode(e);
                }
            }
        }
        else {
            System.out.println("Console init error");
        }
    }

    private static void processErrorByCode(ExitException e) throws ExitException{
        switch (e.getErrorCode()) {
            case "INVALID_LOAN", "INVALID_MONTH_PAY", "INVALID_PERCENT", "UNKNOWN_CLIENT_TYPE", "SYNTAX_ERROR" ->
                    throw e;
            case "UNPAYABLE_LOAN" -> System.out.println("Loan can not be paid with current input");
        }
    }
}