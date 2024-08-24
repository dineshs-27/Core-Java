package DSA.OOPS;

public class rectangle extends shape {
    double length, breadth;

    rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}