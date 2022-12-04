package Learn;

import java.util.Scanner;

// Reverse a string using while loop !

public class WhileLoop {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String S1 = getInput.nextLine();
        String S2 = "";
        int i=S1.length()-1;
        while(i>=0){
            char C = S1.charAt(i);
            S2 = S2 + C;
            i--;
        }
        System.out.println(S2);
    }
}