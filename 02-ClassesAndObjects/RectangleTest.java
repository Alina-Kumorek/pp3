// 28.	Define a class for describing rectangles.
// Then create two objects that represents rectangles with dimensions of 3x4 and 2x7 respectively.
// Display their dimensions, perimeters and surface areas.

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(3, 4);
        rec1.display();
        
        Rectangle rec2 = new Rectangle(2, 7);
        rec2.display();
    }
}