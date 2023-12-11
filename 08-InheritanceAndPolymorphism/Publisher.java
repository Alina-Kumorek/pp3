// 14.	Add a Publisher class definition to your project that includes the name and city attributes.
// Add a constructor in the class where you assign initial values for the attributes.
// Also add accessor and mutator methods for all attributes.

public class Publisher {
    private String name;
    private String city;
    
    public Publisher(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
}