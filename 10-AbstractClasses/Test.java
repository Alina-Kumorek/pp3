public class Test {
    public static void main(String[] args) {
        messages();
    }

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

    }
}