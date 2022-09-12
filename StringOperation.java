package Learn;

import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        StringOperation Func = new StringOperation();
        Func.printChar();
        Func.StringCheck();
        Func.lastOccurance();
    }

    public void printChar() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String S = getInput.nextLine();
        System.out.println("Name : " + S);
        for (int i = 0; i < S.length(); i++) {
            System.out.println(S.charAt(i));
        }
    }

    public void StringCheck() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String S = getInput.nextLine();
        System.out.println("Enter the Character : ");
        String C = getInput.next();
        boolean R = S.contains(C);
        if (R == true) {
            System.out.println("Present");
        }
        else {
            System.out.println("Not Present");
        }
    }
    public void lastOccurance(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String S = getInput.nextLine();
        System.out.println("Enter the Character : ");
        char C = getInput.next().charAt(0);
        int I = S.lastIndexOf(C);
        if(I>=0){
            System.out.println("Last Index : " + I);
        }
        else{
            System.out.println("Character is not Available");
        }
    }
}