package syed;

public class BankAccount {

    // Member variables
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. Current balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. Current balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("John Doe", 12345, 4000);

        // Display initial balance
        System.out.println("Initial Balance: " + account.getBalance());

        // Perform deposit
        account.deposit(2000);

        // Perform withdrawal
        account.withdraw(1000);

        // Check minimum balance
        String status = account.getBalance() >= 5000 ? "Minimum Balance Maintained" : "Minimum Balance Not Maintained";

        // Display status
        System.out.println("Status: " + status);
    }
}
