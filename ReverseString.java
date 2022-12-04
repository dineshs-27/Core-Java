package Learn;

import java.util.Scanner;

// Reverse a string using for loop !

public class ReverseString {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String S1 = getInput.nextLine();
        String S2 = "";
        for (int i = S1.length() - 1; i >= 0; i--) {
            char C = S1.charAt(i);
            S2 = S2 + C;
        }
        System.out.println(S2);
    }
}