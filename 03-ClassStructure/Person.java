// 9.	Define a class Person for person’s record.
// The class should contain the attributes: name, weight (kg) and height (cm). Add constructors:
//     a.	Person(name)
//     b.	Person(name,weight,height)
// Then add methods that represents the object's behaviors:
//     c.	setWeightAndHeight(weight,height)
//     d.	calculateBMI() – calculates Body Mass Index
//     e.	displayRecord() – displays full info (name, weight, height, and BMI)
// The correct BMI value is 18.5 to 24.9.
// When displaying a person’s record, if the BMI is too low, display the message: "BMI too low".
// When the index is too high, display the message: "BMI too high".
// Write a program, create three persons and display their records.

public class Person {
    static double lowBMI = 18.5;
    static double highBMI = 24.9;

    String name;
    double weight;
    double height;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        return weight / Math.pow(height / 100, 2);
    }

    public void displayRecord() {
        System.out.printf("Name:\t%s\n", name);
        System.out.printf("Weight:\t%.0f kg\n", weight);
        System.out.printf("Height:\t%.0f cm\n", height);
        double bmi = calculateBMI();
        System.out.printf("BMI:\t%.1f\n", bmi);
        if (bmi < Person.lowBMI) {
            System.out.println("BMI too low");
        } else if (bmi > Person.highBMI) {
            System.out.println("BMI too high");
        }
        System.out.println("------------");
    }
}
