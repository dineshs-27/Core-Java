import java.util.Scanner;

public class equilibriumIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(equli(len, arr));
    }

    private static int equli(int len, int[] arr) {
        int leftsum, rightsum;

        for(int i=0; i<len; i++){

            leftsum = 0;
            for(int j=0; j<i; j++){
                leftsum += arr[j];
            }

            rightsum = 0;
            for(int j=i+1; j<len; j++){
                rightsum += arr[j];
            }

            if(leftsum == rightsum){
                return i+1;
            }
        }
        return -1;
    }
}