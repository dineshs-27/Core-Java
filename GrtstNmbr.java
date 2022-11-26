package Learn;

import java.util.Scanner;

public class GrtstNmbr {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the Number a : ");
        int a = getInput.nextInt();
        System.out.println("Enter the Number b : ");
        int b = getInput.nextInt();
        System.out.println("Enter the Number c : ");
        int c = getInput.nextInt();
        if(a>b && a>c){
            System.out.println("The Largest Number : " + a);
        }
        else if(b>a && b>c){
            System.out.println("The Largest Number : " + b);
        }
        else if(c>a && c>b){
            System.out.println("The Largest Number : " + c);
        }
        else{
            System.out.println("All Numbers are Same");
        }
    }
}