import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElmnt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        grtelmnt(arr, len);
    }

    private static void grtelmnt(int[] arr, int len) {
        int[] result = new int[len];
        Stack<Integer> stack = new Stack<>();

        for(int i=len-1; i>=0; i--){
            while(!stack.empty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            if(stack.empty()){
                result[i] = -1;
            }
            else{
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        System.out.println(Arrays.toString(result));
    }
}