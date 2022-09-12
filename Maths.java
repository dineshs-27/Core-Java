package Learn;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args){
        Maths Sum = new Maths();
        int X = Sum.add();
        System.out.println("Sum =" + X);
        int Y = Sum.multiply();
        System.out.println("Multiply =" + Y);
    }
    public int add(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int a = getInput.nextInt();
        System.out.println("Enter the Number 2 :");
        int b = getInput.nextInt();
        return a+b;
    }
    public int multiply(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the Number 1 :");
        int c = getInput.nextInt();
        System.out.println("Enter the Number 2 :");
        int d = getInput.nextInt();
        return c*d;
    }
}