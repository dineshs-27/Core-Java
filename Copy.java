package Learn;

import java.util.Scanner;

// Copying same as first String !

public class Copy {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String S1 = getInput.next();
        String S2 = S1;
        System.out.println(S2);
    }
}