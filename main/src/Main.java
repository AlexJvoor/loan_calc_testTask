
public class Main {
    public static void main(String[] args) {
        if (args.length != 4)
            Exit.exit("Usage:\njava loan_calc loan monthPay percent clientType\n");
        Client client = new Client(args[0], args[1], args[2], args[3]);
        Evaluations.evalClientData(client);
        Calculations.calcOverpay(client);
    }
}