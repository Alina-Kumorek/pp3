// 17.	The sales system consists of three categories of objects: a seller, a customer and a purchased product.
// The seller can be a company while the customer is a person. Create class diagrams for each of the object categories.
// Then, based on the created class diagrams, define corresponding classes. Save all three diagrams in one file.
// Finally, define classes based on the created class diagrams and write a program that creates objects,
// assign them attribute values, and call the defined methods.

public class SalesSystem {
    public static void main(String[] args) {
        Seller s1 = new Seller("0001", "The Leather Shop");
        Product p1 = new Product("Leather purse", 250);
        s1.addOffer(p1);
        Product p2 = new Product("Black shoes", 300);
        s1.addOffer(p2);
        Product p3 = new Product("Keychain with logo", 15);
        s1.addOffer(p3);
        s1.displayProducts();

        Customer c1 = new Customer("0001", "Jane Doe");
        c1.addToWallet(300);
        c1.displayInventory();

        c1.buy(s1, 0);
        c1.displayInventory();

        s1.displayProducts();
    }
}
