public class Product {
    private String name;
    private float price;
    
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Product name: %s; Price: %.2f PLN", name, price);
    }
}