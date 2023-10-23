// 25.	Specify at least five attributes and three behaviors for the objects:
//     b.	Bank account
// Then, in separate files, create classes representing above objects. Define attributes and methods.
// Do not create a main method, just classes with their attributes and empty methods.
// After that, compile both classes to check whether their syntax is correct.
// Finally, display list of class attributes and methods in the VSCode (OUTLINE panel).

public class BankAccount {
    String accNumber = "1234567890";
    // nie wsadzałabym dokładnej warości do float, więc to jest w groszach czy coś
    int accBalance = 150650;
    String ownerFirstName = "Jane";
    String ownerLastName = "Doe";
    String creationDate = "2023.01.01";
    boolean hasCreditCard = true;

    void showInfo() {
        System.out.printf("Account Number:\t\t%s\n", accNumber);
        System.out.printf("Account Owner:\t\t%s %s\n", ownerFirstName, ownerLastName);
        System.out.printf("Account Balance:\t%.2f PLN\n", (double) accBalance / 100);
    }

    void transfer (int amount) {
        accBalance += amount;
    }

    void changeOwnerName (String firstName, String lastName) {
        ownerFirstName = firstName;
        ownerLastName = lastName;
    }
}