package Learn;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the Number a : ");
        a = getInput.nextInt();
        System.out.println("Enter the Number b : ");
        b = getInput.nextInt();
        System.out.println("Before Swapping a & b : "+a+" "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping a & b : "+a+" "+b);
    }
}
