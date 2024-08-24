package DSA.OOPS;

import java.util.Scanner;

public class areaOops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle: ");
        int radius = sc.nextInt();
        shape cir = new circle(radius);
        System.out.println("Area of the circle: " + cir.calculateArea() + "\n");

        System.out.println("Enter the length of rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        int breadth = sc.nextInt();
        shape rec = new rectangle(length, breadth);
        System.out.println("Area of the circle: " + rec.calculateArea() + "\n");

        System.out.println("Enter the base of triangle: ");
        int base = sc.nextInt();
        System.out.println("Enter the height of triangle: ");
        int height = sc.nextInt();
        shape tri = new triangle(base, height);
        System.out.println("Area of the circle: " + tri.calculateArea());
    }
}