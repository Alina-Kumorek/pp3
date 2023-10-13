public class Student {
    String name;
    int age;
    int id;
    boolean valid_id;
    int semester;
    float av_grade;
    // zrobić te zmienne camel case

    void sayHello() {
        System.out.println("Hello from " + name);
    }

    void displayName() {
        System.out.println("Name: " + name);
    }

    void displayAge() {
        System.out.println("Age: " + age);
    }

    void displayInfo() {
        System.out.println("Name: " + name + "\nSemester: " + semester + "\nAverage Grade: " + av_grade);
    }

    void validateID(boolean status) {
        valid_id = status;
    }

    void displayID() {
        String status = valid_id ? "valid" : "invalid";
        System.out.println("Name: " + name + "\nID Card Number: " + id + "Is ID Card Valid?: " + status);
    }
}