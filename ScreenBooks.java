package Bookings;

import java.util.Scanner;

// Example program for seat booking system !

public class ScreenBooks {
    public static void main(String[] args) {
        String[] A = new String[5];
        A[0] = "1";
        A[1] = "2";
        A[2] = "3";
        A[3] = "4";
        A[4] = "5";
        String[] B = new String[5];
        B[0] = "6";
        B[1] = "7";
        B[2] = "8";
        B[3] = "9";
        B[4] = "10";
        System.out.print("A");
        for(int i=0; i<A.length; i++){
            System.out.print("\t");
            System.out.print(A[i]);
        }
        System.out.print("\nB");
        for(int i=0; i<B.length; i++){
            System.out.print("\t");
            System.out.print(B[i]);
        }
        System.out.print("\nEnter the Seat Number : ");
        Scanner getInput = new Scanner(System.in);
        int x = getInput.nextInt();
        System.out.print("A");
        for(int i=0; i<A.length; i++){
            System.out.print("\t");
            System.out.print(A[i]);
        }
        System.out.print("\nB");
        if(x==7) {
            B[1] = "*";
            for(int i=0; i<A.length; i++){
                System.out.print("\t");
                System.out.print(B[i]);
            }
        }
        System.out.println("\nYour seat is booked");
    }
}