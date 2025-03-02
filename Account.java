import java.util.Scanner;
public class Account {

private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.displayBalance();
        account1.deposit(1000);
        account1.withdraw(500);
        account1.displayBalance();

        Account account2 = new Account(2000);
        account2.displayBalance();
        account2.deposit(500);
        account2.withdraw(3000);
        account2.displayBalance();
    }
}
// Output
Current Balance: 0.0
Deposited: 1000.0
Withdrew: 500.0
Current Balance: 500.0
Current Balance: 2000.0
Deposited: 500.0
Insufficient balance.
Current Balance: 2500.0
