package Java_Basic_Programs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) throws IOException {
        Scanner getInput = new Scanner(System.in);
//      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        String b;
        System.out.println("Enter the Integer : ");
        a = getInput.nextInt();
        System.out.println("Entered Integer is " + a);
        System.out.println("Enter the Sting : ");
//      When the scanner reads the input for the next int, it buffers the newline character that you used to finish inputting the number.
//      So when you call nextLine it returns an empty string. You can clear the buffer by calling nextLine a second time,
//      otherwise you have to use a different way of reading the input (BufferReader).
        getInput.nextLine();
        b = getInput.nextLine();
//      b = reader.readLine();
        System.out.println("Entered String is " + b);
    }
}