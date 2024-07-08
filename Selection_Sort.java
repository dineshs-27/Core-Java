package Java_Basic_Programs;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args){
        int[] a = {72, 50, 10, 44, 20};
        System.out.println("Sorted Array: ");
        sorted(a);
    }

    static void sorted(int[] a) {
        int al = a.length;
        for (int i = 0; i < al; i++){
            int min = i;
            for (int j = i+1; j < al; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}