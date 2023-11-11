// 15.	The Product class describes food products using two attributes: the product name
// and whether the product is vegetarian. Define the class, its attributes,
// and getter and setter methods for all attributes.
// Then, create a product, set attributes' values and display product information.

public class Product {
    private String name;
    private boolean isVegetarian;

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

}