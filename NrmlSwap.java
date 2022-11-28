package Learn;

import java.util.Scanner;

public class NrmlSwap {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter number a : ");
        int a = getInput.nextInt();
        System.out.println("Enter number b : ");
        int b = getInput.nextInt();
        System.out.println("Before Swapping : " + a + " " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : " + a + " " + b);
    }
}