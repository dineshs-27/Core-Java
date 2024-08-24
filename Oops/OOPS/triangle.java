package DSA.OOPS;

public class triangle extends shape {
    double base, height;

    triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}