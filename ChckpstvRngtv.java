package Learn;

import java.util.Scanner;

public class ChckpstvRngtv{
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter a number x : ");
        int x = getInput.nextInt();
        if(x>0){
            System.out.println("The given number is Positive");
        }
        else{
            System.out.println("The given number is negative");
        }
    }
}