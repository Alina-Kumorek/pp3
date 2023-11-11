public class SurfaceArea {
    static float pi = 3.14f;
    static float rectangle(float a, float b){
        return a*b;
    }

    static float circle(float r) {
        return SurfaceArea.pi*r*r;
    }

    static float triangle(float b, float h) {
        return b*h/2;
    }

    // 10.	In the class SurfaceArea, add methods to calculate the surface area of the following solids:
    // cuboid, sphere, cone. In the VSCode, display a list with all defined methods (OUTLINE panel).
    // Then, complete the program to calculate and display the surface area of solids with sample dimensions.
    static float cuboid(float a, float b, float c) {
        return 2*(a*b+b*c+c*a);
    }

    static float sphere(float r) {
        return 4*SurfaceArea.pi*r*r;
    }

    static float cone (float r, float l) {
        return SurfaceArea.pi*r*r + SurfaceArea.pi*r*l;
    }
}