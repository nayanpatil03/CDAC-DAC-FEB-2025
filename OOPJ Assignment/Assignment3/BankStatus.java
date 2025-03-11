import java.util.Scanner;

class BankAccount {
    double balance = 0; // Stores account balance

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount < balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

// Main Class
public class BankStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount myAccount = new BankAccount();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        myAccount.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        myAccount.withdraw(withdrawAmount);

        myAccount.checkBalance(); // Check remaining balance

    }
}
