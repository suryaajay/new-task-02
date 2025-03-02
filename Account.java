import java.util.Scanner;
public class Account {

//    private double balance;
//    public Account() {
//        this.balance = 0.0;
//    }
//
//    public Account(double initialBalance) {
//        if (initialBalance > 0) {
//            this.balance = initialBalance;
//        } else {
//            this.balance = 0.0;
//        }
//    }
//
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.println("Deposited: " + amount);
//        } else {
//            System.out.println("Deposit amount must be positive.");
//        }
//    }
//
//    public void withdraw(double amount) {
//        if (amount > 0 && amount <= balance) {
//            balance -= amount;
//            System.out.println("Withdrew: " + amount);
//        } else if (amount > balance) {
//            System.out.println("Insufficient funds.");
//        } else {
//            System.out.println("Withdrawal amount must be positive.");
//        }
//    }
//
//    public void displayBalance() {
//        System.out.println("Current Balance: " + balance);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Account account1 = new Account();
//        account1.displayBalance();
//
//        System.out.print("Enter amount to deposit in account1: ");
//        double depositAmount = scanner.nextDouble();
//        account1.deposit(depositAmount);
//        account1.displayBalance();
//
//        System.out.print("Enter amount to withdraw from account1: ");
//        double withdrawAmount = scanner.nextDouble();
//        account1.withdraw(withdrawAmount);
//        account1.displayBalance();
//
//        System.out.print("Enter initial balance for account2: ");
//        double initialBalance = scanner.nextDouble();
//        Account account2 = new Account(initialBalance);
//        account2.displayBalance();
//
//        System.out.print("Enter amount to deposit in account2: ");
//        depositAmount = scanner.nextDouble();
//        account2.deposit(depositAmount);
//        account2.displayBalance();
//
//        System.out.print("Enter amount to withdraw from account2: ");
//        withdrawAmount = scanner.nextDouble();
//        account2.withdraw(withdrawAmount);
//        account2.displayBalance();
//        scanner.close();
//    }
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
