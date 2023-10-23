public class Rectangle {
    int a;
    int b;
    int perimeter;
    int surface;
    
    public Rectangle (int x, int y) {
        a = x;
        b = y;
        perimeter = 2*a + 2*b;
        surface = a*b;
    }

    void display() {
        System.out.printf("Dimensions:\t%dx%d\n", a, b);
        System.out.printf("Perimeter:\t%d\n", perimeter);
        System.out.printf("Surface:\t%d\n", surface);
    }
}