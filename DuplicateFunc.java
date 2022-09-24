package Learn;

import java.util.Scanner;

public class DuplicateFunc {
    public static void main(String[] args) {
        DuplicateFunc Check = new DuplicateFunc();
        Check.Count();
        //Check.Duplicate();
    }

    public void Count() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String S = getInput.nextLine();
        System.out.println("Enter the Character : ");
        char C = getInput.next().charAt(0);
        int Sl = S.length();
        int cnt = 0;
        for (int i = 0; i < Sl; i++) {
            if (S.charAt(i) == C) {
                cnt++;
            }
        }
        System.out.println("Character Counts : " + cnt);
    }

    public void Duplicate() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String S = getInput.nextLine();
        String R = "";
        for (int i = 0; i < S.length(); i++) {
            char C = S.charAt(i);
                if (R.indexOf(C) < 0){
                   R = R + S.charAt(i);
                }
        }
        System.out.println(R);
    }
}
