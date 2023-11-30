// 8.	Based on the created class diagrams, define all classes.

// 10.	If your account balance is less than the withdrawal amount, no withdrawal is possible.
// Include this condition in the program. When you try to withdraw, display a message.

// 11.	In line with the bank's policy, you can withdraw no more than PLN 500 from your account at one time.
// Include these limitation in your program. Display a message when trying to withdraw a larger amount.

public class BankAccount {
    private String id;
    private String accHolder;
    private double balance;

    public BankAccount(String id, String accHolder) {
        this.id = id;
        this.accHolder = accHolder;
        this.balance = 0d;
    }

    public String getId() {
        return id;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            if (amount <= 500d) {
                this.balance -= amount;
            } else {
                System.out.println("You can withdraw no more than PLN 500 at one time.");
            }
        } else {
            System.out.println("The account balance is less than the withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.printf("The account balance is %.2f PLN\n", balance);
    }
}