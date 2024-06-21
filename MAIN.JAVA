import java.util.ArrayList;
import java.util.Scanner;

// Define a Transaction class to store transaction details
class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}

// ATM class with main functionalities
public class ATM {
    private double balance;
    private ArrayList<Transaction> transactionHistory;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    // Method to deposit money into the ATM
    public void deposit(double amount) {
        balance += amount;
        Transaction transaction = new Transaction("Deposit", amount);
        transactionHistory.add(transaction);
        System.out.println(amount + " deposited successfully.");
    }

    // Method to withdraw money from the ATM
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            Transaction transaction = new Transaction("Withdrawal", amount);
            transactionHistory.add(transaction);
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    // Method to transfer money from ATM to another account (simplified for this example)
    public void transfer(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Transfer failed.");
        } else {
            balance -= amount;
            Transaction transaction = new Transaction("Transfer", amount);
            transactionHistory.add(transaction);
            System.out.println(amount + " transferred successfully.");
        }
    }

    // Method to display transaction history
    public void displayTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    // Main method to simulate ATM interactions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(1000.0); // Starting balance

        boolean exit = false;
        while (!exit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer Money");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    atm.transfer(transferAmount);
                    break;
                case 4:
                    atm.displayTransactionHistory();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
        scanner.close();
    }
}
