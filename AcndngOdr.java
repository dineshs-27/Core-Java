package Learn;

import java.util.Arrays;

import java.util.Scanner;

public class AcndgOdr {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter number of elements in array : ");
        int x = getInput.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getInput.nextInt();
        }
        System.out.println("Elements of Original array : " + Arrays.toString(arr));
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of ascending array : " + Arrays.toString(arr));
    }
}
