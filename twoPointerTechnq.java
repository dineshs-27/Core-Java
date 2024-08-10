import java.util.Arrays;
import java.util.Scanner;

public class twoPointerTechnq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        ary(len, arr);
    }

    private static void ary(int len, int[] arr) {
        int j=0;

        for(int i=0; i<len; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        while(j<len){
            arr[j] = 0;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}