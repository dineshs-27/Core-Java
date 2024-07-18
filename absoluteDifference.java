import java.util.Scanner;

public class absoluteDifference {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i=0; i<l; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the difference: ");
        int diff = sc.nextInt();
        System.out.println(abslt(l, arr, num, diff));
    }

    private static int abslt(int l, int[] arr, int num, int diff){
        int count = 0;
        for(int i=0; i<l; i++){
            if(Math.abs(num - arr[i]) <= diff){
                count++;
            }
        }
        return count > 0 ? count : -1;
    }
}