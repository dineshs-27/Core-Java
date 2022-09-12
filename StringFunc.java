package Learn;

import java.util.Scanner;

public class StringFunc {
    public static void main(String[] args){
        String S1 = "Dinesh S";
        String S2 = "Dinesh";
        String S3 = "S";
        String S4 = new String("Dinesh S");
        System.out.println(S1==S4);
        char C = S1.charAt(0);
        System.out.println(C);
        System.out.println(S1.toLowerCase());
        System.out.println(S1.toUpperCase());
        System.out.println(S1.charAt(0));
        System.out.println(S1.equals(S2));
        System.out.println(S1.contains("D"));
        System.out.println(S2.concat(" "+S3));
        System.out.println(S2.endsWith("h"));
        System.out.println(S3.length());
        System.out.println(S1.matches(S2));
    }
}