package Learn;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        ControlStatements Func = new ControlStatements();
        Func.ifStatement();
        Func.ifelse();
        Func.forlp();
        Func.forloop();
    }

    public void ifStatement() {
        int x = 7;
        if (x==0) {
            System.out.println("The Number is Zero");
        } else {
            System.out.println("The Number is Other than Zero");
        }
    }

    //Used by Scanner user input.
    public void ifelse() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = getInput.nextInt();
        if (n == 0) {
            System.out.println("The Number is Equals than 0");
        } else if (n < 0) {
            System.out.println("The is lesser than 0");
        } else {
            System.out.println("The Number is Greater than 0");
        }
    }

    public void forlp() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }

    //Used by Scanner user input.
    public void forloop() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the Starting Number :");
        int a = getInput.nextInt();
        System.out.println("Enter the Ending Number :");
        int b = getInput.nextInt();
        for (int i = a; i < b; i++) {
            System.out.println(i);
        }
    }
}
