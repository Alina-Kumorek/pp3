// 9.	Write a program that performs the following actions for the bank account:
//     a.	Deposit PLN 500
//     b.	Display balance
//     c.	Deposit PLN 200
//     d.	Display balance
//     e.	Withdraw PLN 300
//     f.	Display balance

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("0001", "Doe, Jane");
        a.deposit(500d);
        a.displayBalance();
        a.deposit(200d);
        a.displayBalance();
        a.withdraw(300d);
        a.displayBalance();
        a.withdraw(450d);
        a.deposit(400d);
        a.withdraw(600d);
    }
}