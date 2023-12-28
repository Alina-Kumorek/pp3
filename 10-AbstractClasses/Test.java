public class Test {
    public static void main(String[] args) {
        vehicles();
    }

    // 6.	Define the Rectangle, Triangle, and Circle classes that derive from the Shape class.
    // Then write a program in which you create one object for each of the ageometric figures
    // and calculate and display the area of these figures.

    // 7.	Complete the Shape class with an abstract perimeter() method that returns the perimeter of a geometric figure.
    // Then write a program in which you create one object for each of the geometric figures,
    // and calculate and display both the area and perimeter of these figures.
    static void shapes() {
        Rectangle r = new Rectangle(2, 5);
        Triangle t = new Triangle(3, 4, 5);
        Circle c = new Circle(4);

        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(t.area());
        System.out.println(t.perimeter());
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }

    static void messages() {
        User u1 = new User("Ann", "Smith", "ann11@gmail.com", "123-456-789");
        SMS s1 = new SMS("How r u?", u1);
        s1.send();
        SMS s2 = new SMS("Hi!!!!!!");
        User u2 = new User("Jane", "Doe", "janedoe@gmail.com", "000-111-222");
        s2.setRecipient(u2);;
        s2.send();

        Email e = new Email("Dear Annie, ...", "Best wishes", u1);
        e.send();
    }

    static void vehicles() {
        Car car = new Car(5, 240, "Electric");
        Bus bus = new Bus(50, 120, 90);
        Truck truck = new Truck(160, 20);

        car.specs();
        bus.specs();
        truck.specs();
    }
}