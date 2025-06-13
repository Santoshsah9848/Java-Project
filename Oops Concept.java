// Problem on Oops Concept
abstract class Account {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    public Account(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract void accountType();
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
class SavingsAccount extends Account {

    public SavingsAccount(String accountHolderName, String accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }
    @Override
    public void accountType() {
        System.out.println("Account Type: Savings Account");
    }
}
class CurrentAccount extends Account {

    public CurrentAccount(String accountHolderName, String accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }
    @Override
    public void accountType() {
        System.out.println("Account Type: Current Account");
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Santosh", "SA12345", 10000);
        sa.accountType();
        sa.displayBalance();
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.displayBalance();

        System.out.println("--------------------------------");
        CurrentAccount ca = new CurrentAccount("Rahul", "CA54321", 50000);
        ca.accountType();
        ca.displayBalance();
        ca.deposit(10000);
        ca.withdraw(30000);
        ca.displayBalance();
    }
}
