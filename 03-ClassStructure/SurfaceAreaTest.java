// 4.	Define a class SurfaceArea that contains static methods to calculate the surface area for:
// circle, rectangle and triangle. Then, write a program that calculates and displays:
//     a.	area of a rectangle with sides 4 and 5
//     b.	area of a circle with a radius of 3
//     c.	area of a triangle with base 3 and height 4

public class SurfaceAreaTest {
    public static void main(String[] args) {
        System.out.print("Rectangle area (4,5) is ");
        System.out.println(SurfaceArea.rectangle(4,5));
        System.out.print("Circle area (3) is ");
        System.out.println(SurfaceArea.circle(3));
        System.out.print("Triangle area (3,4) is ");
        System.out.println(SurfaceArea.triangle(3,4));
        System.out.print("Cuboid area (3,4,2) is ");
        System.out.println(SurfaceArea.cuboid(3, 4, 2));
        System.out.print("Sphere area (3) is ");
        System.out.println(SurfaceArea.sphere(3));
        System.out.print("Cone area (3,5) is ");
        System.out.println(SurfaceArea.cone(3,5));
    }
}