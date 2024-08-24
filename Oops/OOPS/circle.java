package DSA.OOPS;

public class circle extends shape {
    double radius;

    circle(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI * radius * radius;
    }
}