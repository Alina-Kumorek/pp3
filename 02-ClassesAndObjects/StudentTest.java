public class StudentTest {    
    public static void main(String[] args) {
        // call method for the choosen exercise
        Ex19();
    }

    // 15.	Create a Student class object. To do this, create a separate StudentTest class with the main() method.
    // Assign values to object attributes.
    static void Ex15() {
        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);
    }

    // 16.	In the Student class, add the following methods that represent object behaviors:
    //     a.	sayHello()
    //     b.	displayName()
    //     c.	displayAge()
    // Then, add a statement in each of the methods to display the appropriate information.
    static void Ex16() {

        Student s = new Student();

        s.name = "Peter";
        s.age = 21;

        s.sayHello();
        s.displayName();
        s.displayAge();
    }

    // 18.	Create two Student class objects. Assign values to the object fields. Then, call the methods.
    static void Ex18() {
        // Peter
        Student s1 = new Student();

        s1.name = "Peter";
        s1.age = 21;

        s1.sayHello();
        s1.displayName();
        s1.displayAge();

        // Ann
        Student s2 = new Student();

        s2.name = "Ann";
        s2.age = 23;

        s2.sayHello();
        s2.displayName();
        s2.displayAge();
    }

    // 19.	Add the following fields and methods to the Student class to represent object attributes and behaviors:
    //     a.	Object attributes:
    //         (1) student ID card,
    //         (2) whether the student ID card is valid or not,
    //         (3) semester number,
    //         (4) average grade.
    //     b.	Object behaviors:
    //         (1) display the student’s name, semester number and average grade,
    //         (2) change the status of student ID card (valid/invalid),
    //         (3) display the student’s name, ID card number and whether the ID card is valid (you can use ?: operator).
    // Then create two Student class objects, assign them some values and call methods.
    static void Ex19() {
        // Peter
        Student s1 = new Student();

        s1.name = "Peter";
        s1.age = 21;
        s1.id = "1234";
        s1.isIdValid = true;
        s1.semester = 1;
        s1.avGrade = 2.3f;

        s1.displayInfo();
        s1.displayId();
        s1.validateId(false);
        s1.displayId();

        // Ann
        Student s2 = new Student();

        s2.name = "Ann";
        s2.age = 23;
        s2.id = "4321";
        s2.isIdValid = false;
        s2.semester = 3;
        s2.avGrade = 4.1f;

        s2.displayInfo();
        s2.displayId();
        s2.validateId(true);
        s2.displayId();
    }
}