package Learn;

import java.util.Scanner;

// Checking vowel letter is present or not !

public class Vowels {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the words : ");
        String S1 = getInput.nextLine();
        if(S1.toLowerCase().matches(".*[aeiou].*")){
            System.out.println("Vowel letter is present");
        }
        else{
            System.out.println("Vowel letter is not present");
        }
    }
}