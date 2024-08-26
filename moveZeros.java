import java.util.Arrays;
import java.util.Scanner;

public class moveZeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(answr(n, nums));
    }

    private static String answr(int n, int[] nums) {
        int index = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }

        for(int i=index; i<n; i++){
            nums[i] = 0;
        }

        return Arrays.toString(nums);
    }
}