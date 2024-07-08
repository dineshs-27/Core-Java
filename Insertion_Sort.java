package Java_Basic_Programs;
import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args){
        int[] a = {11, 9, 7, 15, 6, 10, 5, 17};
        System.out.println("Sorted Array: ");
        Insertion(a);
    }

    private static void Insertion(int[] a) {
        int al = a.length;

        for(int i = 1; i < al; i++){
            int key = a[i];
            int j = i - 1;

            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = key;
        }
        System.out.println(Arrays.toString(a));
    }
}