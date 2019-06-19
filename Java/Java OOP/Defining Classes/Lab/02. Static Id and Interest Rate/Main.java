import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> accounts = new HashMap<>();

        String line = scanner.nextLine();

        while (!line.equalsIgnoreCase("end")) {

            String[] commandArgs = line.split("\\s+");

            switch (commandArgs[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    accounts.put(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                    break;

                case "Deposit":
                    int id = Integer.valueOf(commandArgs[1]);
                    double amount = Double.valueOf(commandArgs[2]);

                    try {
                        accounts.get(id).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                    } catch (Exception ex) {
                        System.out.println("Account does not exist");
                    }
                    break;

                case "SetInterest":
                    BankAccount.setInterest(Double.parseDouble(commandArgs[1]));
                    break;

                case "GetInterest":
                    try {
                        System.out.printf("%.2f%n",
                                accounts.get(Integer.parseInt(commandArgs[1]))
                                        .getInterestRate(Integer.parseInt(commandArgs[2])));
                    } catch (Exception ex) {
                        System.out.println("Account does not exist");
                    }
                    break;

            }
            line = scanner.nextLine();
        }
    }
}
