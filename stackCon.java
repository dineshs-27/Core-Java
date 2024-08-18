package DSA;
import java.util.Scanner;
import java.util.Stack;

public class stackCon {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("Enter the number of elements to push in stack: ");
        int len = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements: ");
        for(int i=0; i<len; i++){
            stack.push(sc.nextLine());
        }
        System.out.println(stack);
    }
}