import java.util.Arrays;
import java.util.Scanner;

public class productSmallestPair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();
        System.out.println("Enter the array length: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i=0; i<l; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(pro(sum, l, arr));
    }

    private static int pro(int sum, int l, int[] arr) {
        if(arr == null || l < 2){
            return -1;
        }

        Arrays.sort(arr);
        int add = arr[0] + arr[1];
        if(add <= sum){
            return arr[0] * arr[1];
        }else {
            return 0;
        }
    }
}