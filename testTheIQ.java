import java.util.ArrayList;
import java.util.Scanner;

public class testTheIQ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(iq(len, arr));
    }

    private static int iq(int len, int[] arr) {
        ArrayList<Integer> evenarr = new ArrayList <>();
        ArrayList <Integer> oddarr = new ArrayList <>();
        for(int i=0; i<len; i++){
            if(arr[i] % 2 == 0) {
                evenarr.add(i);
            }
            else{
                oddarr.add(i);
            }
        }
        if(evenarr.size() > oddarr.size()){
            return (oddarr.get(0) + 1);
        }else{
            return (evenarr.get(0) + 1);
        }
    }
}
