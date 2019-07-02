public class Main {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.id = 1;
        ba.balance = 15;

        System.out.printf("Account ID%d, balance %.2f",
                ba.getId(),
                ba.getBalance());

    }
}
