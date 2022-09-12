package Learn;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        EvenOdd Sum = new EvenOdd();
        Sum.OddorEve();
    }
    public int  OddorEve(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the starting number :");
        int a = getInput.nextInt();
        System.out.println("Enter the ending number :");
        int b = getInput.nextInt();
        int even=0;
        int odd=0;
        for(int i=a;i<b;i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
                even++;
            } else {
                System.out.println(i + " is Odd");
                odd++;
            }
        }
        System.out.println("The Total Number of Even : " + even);
        System.out.println("The Total Number of Odd : " + odd);
        return 0;
    }
}