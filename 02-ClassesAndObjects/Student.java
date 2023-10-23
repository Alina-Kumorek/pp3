public class Student {

    // object atributes (Ex15)
    String name;
    int age;

    // Ex19
    // a.1. student ID card
    String id;
    // a.2. whether the student ID card is valid or not
    Boolean isIdValid;
    // a.3. semester number
    int semester;
    // a.4. average grade
    float avGrade;


    // object methods
    // sayHello, displayName, displayAge (Ex16)
    void sayHello() {
        System.out.println("Hello from " + name);
    }

    void displayName() {
        System.out.println("Name:\t" + name);
    }

    void displayAge() {
        System.out.println("Age:\t" + age);
    }

    // Ex19
    // b.1. display the student’s name, semester number and average grade
    void displayInfo() {
        displayName();
        System.out.println("Semester:\t" + semester);
        System.out.println("Average grade:\t" + avGrade);
    }
    // b.2. change the status of student ID card (valid/invalid)
    void validateId (boolean status) {
        isIdValid = status;
    }
    // b.3. display the student’s name, ID card number and whether the ID card is valid (you can use ?: operator)
    void displayId () {
        displayName();
        System.out.println("ID card number:\t" + id);
        String status = isIdValid ? "valid" : "invalid";
        System.out.println("ID card status:\t" + status);
    }
}