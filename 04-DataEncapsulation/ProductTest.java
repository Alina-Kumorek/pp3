public class ProductTest {
    public static void main(String[] args) {
        Product p = new Product();

        p.setName("Broccoli");
        p.setVegetarian(true);

        System.out.println("Product name:\t" + p.getName());
        System.out.println("Vegetarian:\t" + (p.isVegetarian() ? "YES" : "NO"));
    }
}