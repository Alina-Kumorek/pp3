// 19.	Define a Point class that contains two attributes: x and y, of integer type (int),
// describing the coordinates of a point on the plane.
// The class constructor contains two parameters and allows you to initialize the object's attributes.
// Create an isX() method in the class that returns true if the point is on the x-axis and false otherwise.
// Create an isY() method in the class that returns true if the point is on the y-axis or false otherwise.
// Add a method in the class to represent the object as text that returns the coordinates of the point in the format "P(x,y)".
// Sample result:
//         Point(3,0)
//         isX() returns false  <--- to jest chyba błąd
//         isY() returns true
//         toString() returns "P(3,0)"

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX() {
        return y == 0;
    }

    public boolean isY() {
        return x == 0;
    }

    public String toString() {
        return String.format("P(%d,%d)", x, y);
    }
}