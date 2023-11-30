import java.util.ArrayList;

public class Customer {
    private String customerId;
    private String name;
    private float wallet;
    private ArrayList<Product> inventory;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.wallet = 0f;
        this.inventory = new ArrayList<Product>();
    }
    
    public void buy(Seller seller, int productNumber) {
        Product prod = seller.getProductList().get(productNumber);
        float prodPrice = prod.getPrice();
        if (prodPrice <= wallet) {
            wallet -= prodPrice;
            inventory.add(seller.sellOffer(productNumber));
            System.out.println("Transaction successfull.");
        } else {
            System.out.println("Transaction unsuccessfull.");
        }
    }

    public void displayInventory() {
        System.out.printf("Customer id:\t%s\n", customerId);
        System.out.printf("Name:\t%s\n", name);
        System.out.printf("Wallet balance:\t%.2f\n", wallet);
        System.out.println("----------------");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(i + ". " + inventory.get(i).toString());
        }
        System.out.println("----------------");
    }

    public void addToWallet(float amount) {
        wallet += amount;
    }
}