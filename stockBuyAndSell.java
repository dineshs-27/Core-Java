import java.util.Scanner;

public class stockBuyAndSell {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(stock(len, arr));
    }

    private static int stock(int len, int[] arr) {
        int profit = 0;
        for(int i=0; i<len-1; i++){
            if(arr[i] < arr[i+1]){
                profit += arr[i] - arr[i+1];
            }
        }
        return Math.abs(profit);
    }
}