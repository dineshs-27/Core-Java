import java.util.Arrays;
import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(missing(len, arr));
    }

    private static int missing(int len, int[] arr) {
        int total = len*(len+1)/2;
        int sum = Arrays.stream(arr).sum();
//        for(int i=0; i<len; i++){
//            sum += arr[i];
//        }
        return (total-sum);
    }
}