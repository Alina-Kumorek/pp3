// 17.	Define a class Person with two attributes describing a person: name (String) and age (int).
// Apply data encapsulation. Define a constructor with the parameters name and age
// to assign initial values of object’s attributes.
// Define access and modification methods for each attribute (getter and setter methods).
// Use method names according to the naming convention.
// Then define a method isAdult() that returns true if a person is an adult (person has at least 18 years)
// or false otherwise. Finally, define a method that returns a string representation of the object
// (name and age, separated by comma). Sample result:
//         Person p = new Person("Anna",21)
//         p.getAge() returns 21
//         p.isAdult() returns true
//         p.setAge(17)
//         p.isAdult() returns false
//         p.toString() returns "Anna,17"

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return getAge() >= 18;
    }

    public String toString() {
        return name + "," + age;
    }
}
