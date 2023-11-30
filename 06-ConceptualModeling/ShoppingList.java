import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private ArrayList<String> list;

    public ShoppingList() {
        this.list = new ArrayList<String>();
    }

    public void add(String productName) {
        list.add(productName);
    }

    // 16.	Add to the list of products the ability to enter product names from the keyboard.
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String ans = scanner.nextLine();
        scanner.close();
        add(ans);
    }

    public void displayAmount() {
        System.out.printf("There's currently %d items on the list.\n", list.size());
    }

    public void displayList() {
        System.out.println("Shopping List\n-------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
          }          
        System.out.println("-------------");
    }
}