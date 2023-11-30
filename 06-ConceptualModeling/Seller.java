import java.util.ArrayList;

public class Seller {
    private String sellerId;
    private String name;
    private ArrayList<Product> productList;
    private float revenue;

    public Seller(String sellerId, String name) {
        this.sellerId = sellerId;
        this.name = name;
        this.revenue = 0f;
        this.productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void addOffer(Product product) {
        productList.add(product);
    }

    public Product sellOffer(int productNumber) {
        revenue += productList.get(productNumber).getPrice();
        return productList.remove(productNumber);
    }

    public void displayProducts() {
        System.out.printf("Seller id:\t%s\n", sellerId);
        System.out.printf("Name:\t\t%s\n", name);
        System.out.printf("Total revenue:\t%.2f\n", revenue);
        System.out.println("----------------");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(i + ". " + productList.get(i).toString());
        }
        System.out.println("----------------");
    }
}