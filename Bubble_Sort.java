package Java_Basic_Programs;
import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args){
        int[] a = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Sorted Array: ");
        sorting(a);
    }

    static void sorting(int[] a){
        int al = a.length - 1;

        for (int i = 0; i < al; i++){
            for (int j = 0; j < al - 1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}