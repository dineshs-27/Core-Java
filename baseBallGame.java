import java.util.Scanner;
import java.util.Stack;

public class baseBallGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int len = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[len];
        System.out.println("Enter the elements: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextLine();
        }
        System.out.println(Solution(len, arr));
    }

    private static int Solution(int len, String[] arr) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<len; i++){
            String op = arr[i];

            if(op.equals("C")){
                stack.pop();
            } else if(op.equals("D")){
                stack.push(2*stack.peek());
            } else if(op.equals("+")){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else{
                stack.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        for(int i=0; i<stack.size(); i++){
            total += stack.get(i);
        }
        return total;
    }
}