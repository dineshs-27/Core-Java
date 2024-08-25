import java.util.Scanner;
import java.util.Stack;

public class stackImplemt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string with stars: ");
        String str = sc.nextLine();
        System.out.println(joint(str));
    }

    private static String joint(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '*'){
                stack.pop();
            }
            else{
                stack.push(str.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        while(!stack.empty()){
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}