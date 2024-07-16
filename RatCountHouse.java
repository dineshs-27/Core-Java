import java.util.Scanner;

public class RatCountHouse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of rats: ");
        int r = input.nextInt();
        System.out.println("Enter the Unit: ");
        int unit = input.nextInt();
        System.out.println("Enter the Array Length: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(solve(r, unit, n, arr));
    }

    private static int solve(int r, int unit, int n, int[] arr) {
        int req = r*unit;
        int sum = 0;
        int count = 0;

        if(arr==null){
            return -1;
        }

        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            count++;
            if(sum>=req){
                break;
            }
        }

        if(sum<req){
            return 0;
        }
        return count;
    }
}