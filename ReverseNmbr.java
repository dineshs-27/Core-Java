package Learn;

import java.util.Scanner;

public class ReverseNmbr {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the Numbers : ");
        String x = getInput.nextLine();
        for(int i=x.length()-1; i>=0; i--){
            System.out.print(x.charAt(i));
        }
    }
}