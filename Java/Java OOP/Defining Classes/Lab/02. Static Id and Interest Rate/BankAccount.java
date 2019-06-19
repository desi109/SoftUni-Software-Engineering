public class BankAccount {
    private static final double DEFAULT_INTEREST_RATE = 0.02;    //constant
    private static int idSequence;
    private static double interestRate;

    private double balance;
    private int id;


    //Constructor
    public BankAccount() {
        interestRate = DEFAULT_INTEREST_RATE;
        this.id = ++idSequence;     //id1 = 1; id2 = 2; id3 = 3; ...
    }

    public int getId() {
        return this.id;
    }

    public double getInterestRate(int years) {
        return this.balance * interestRate * years;
    }

    public static void setInterest(double interest) {
        interestRate = interest;
    }


    public void deposit(double amount) {
        this.balance += amount;
    }

}
