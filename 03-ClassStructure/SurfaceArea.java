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
}