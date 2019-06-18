import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> accounts = new HashMap<>();

        String line = scanner.nextLine();

        while (!line.equalsIgnoreCase("end")) {

            String[] commandArgs = line.split("\\s+");
            int id = Integer.parseInt(commandArgs[1]);
            BankAccount bankAccount = new BankAccount();

            switch (commandArgs[0]) {
                case "Create":
                    if (accounts.containsKey(id)) {
                        System.out.println("Account already exists");
                    } else {
                        bankAccount.setId(id);
                        accounts.put(id, bankAccount);
                    }
                    break;


                case "Deposit":
                    double depositAmount = Double.parseDouble(commandArgs[2]);
                    if (accounts.get(id) == null) {
                        System.out.println("Account does not exist");
                    } else {
                        accounts.get(id).deposit(depositAmount);
                    }

                    break;


                case "Withdraw":
                    double withdrawAmount = Double.parseDouble(commandArgs[2]);
                    if (accounts.get(id) == null) {
                        System.out.println("Account does not exist");

                    } else {
                        if (accounts.get(id).getBalance() < withdrawAmount) {
                            System.out.println("Insufficient balance");
                        } else {
                            accounts.get(id).withdraw(withdrawAmount);
                        }
                    }
                    break;


                case "Print":
                    if (accounts.get(id) == null) {
                        System.out.println("Account does not exist");
                    } else {
                        System.out.println(accounts.get(id));
                    }
                    break;
            }
            line = scanner.nextLine();
        }
    }
}

