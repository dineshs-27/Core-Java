package Learn;

import java.util.Scanner;

public class ConcatStrgn {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the String 1 : ");
        String S1 = getInput.nextLine();
        System.out.println("Enter the String 2 : ");
        String S2 = getInput.nextLine();
        System.out.println("Concat (or) Combined String : " + S1.concat(S2));
    }
}