package Learn;

import java.util.Scanner;

// Changing the first letter into uppercase without using in build functions !

public class Uppercase{
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String S1 = getInput.nextLine();
        char[] arr = S1.toCharArray();
        int ascvl1 = arr[0]-32;
        char C1= (char)ascvl1;
        arr[0] = C1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' '){
                int ascvl2 = arr[i+1]-32;
                char C2 = (char)ascvl2;
                arr[i+1] = C2;
            }
        }
        System.out.println(String.valueOf(arr));
    }
}