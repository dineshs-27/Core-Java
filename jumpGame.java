import java.util.Scanner;

public class jumpGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(jump(len, arr));
    }

    private static boolean jump(int len, int[] arr) {
        int goal = len - 1;
        for(int i=len-2; i>=0; i--){
            if(i + arr[i] >= goal){
                goal = i;
            }
        }
        return goal == 0;
    }
}