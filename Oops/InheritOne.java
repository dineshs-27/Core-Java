package Oops;

import java.util.Scanner;

public class InheritOne {
    public void Parent(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String a = getInput.nextLine();
        System.out.println("Enter your age : ");
        int b = getInput.nextInt();
    }
    public void Child(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter University : ");
        String a = getInput.nextLine();
        System.out.println("Enter Department : ");
        String b = getInput.nextLine();
    }
}