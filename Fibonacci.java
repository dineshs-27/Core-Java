package Learn;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        obj.forlplpResult();
        obj.palindrome();
    }

     public void forlplpResult() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the Repeat times : ");
        int k = getInput.nextInt();
        for (int j = 1; j <= k; j++) {
            System.out.println("Enter a Number : ");
            int a = getInput.nextInt();
            int R = 1;
            for (int i = 1; i <= a; i++) {
                R = R * i;
            }
            System.out.println("Factorial : " + R);
        }
    }

    public void palindrome() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String S1 = getInput.nextLine();
        String S2 = "";
        for( int i = S1.length()-1; i >= 0; i--) {
            char C = S1.charAt(i);
            String R = Character.toString(C);
            S2 = S2 + R;
        }
        if (S1.equals(S2)) {
            System.out.println("Its is a Palindrome Word");
        } else {
            System.out.println("Its is Not a Palindrome Word");
        }
    }
}
