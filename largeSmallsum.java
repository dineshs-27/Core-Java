import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class largeSmallsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i=0; i<l; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(oes(l,arr));
    }
    private static int oes(int l, int[] arr) {
        if(l <= 3 || arr == null){
            return 0;
        }
        ArrayList <Integer> even = new ArrayList <Integer>();
        ArrayList <Integer> odd = new ArrayList <Integer>();
        for(int i=0; i<l; i+=2){
            even.add(arr[i]);
        }
        for(int j=1; j<l; j+=2){
            odd.add(arr[j]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        int e = even.get(even.size() - 2);
        int o = odd.get(1);
        return e + o;
    }
}