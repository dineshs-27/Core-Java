package Learn;

import java.util.Scanner;

public class Rectngle {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the length rectangle : ");
        int x = getInput.nextInt();
        System.out.println("Enter the width rectangle : ");
        int y = getInput.nextInt();
        int area = x*y;
        System.out.println("Area of Rectangle : " + area);
    }
}