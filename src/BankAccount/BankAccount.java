package BankAccount;

public class BankAccount {
    public static int nextAccountCount = 1;
    public static double interestRate = 0.02;
    private int id;
    private double balance;


    public BankAccount() {
        this.id = nextAccountCount;
        nextAccountCount++;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years) {
        return interestRate * years * balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
