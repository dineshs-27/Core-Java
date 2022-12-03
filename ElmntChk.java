package Learn;

import java.util.Scanner;

// Checking larger and smaller element !

public class ElmntChk {
    public static void main(String[] args) {
        ElmntChk obj = new ElmntChk();
        obj.Lrg();
        obj.Sml();
    }
    public void Lrg(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int[] num = new int[getInput.nextInt()];
        System.out.println("Enter the array elements : ");
        for(int i=0; i<num.length; i++){
            num[i] = getInput.nextInt();
        }
        int x = num[0];
        for(int j=1; j<num.length; j++){
            if(x<num[j]){
                x = num[j];
            }
        }
        System.out.println("Largest Number : " + x);
    }

    public void Sml(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int[] num = new int[getInput.nextInt()];
        System.out.println("Enter the array elements : ");
        for(int i=0; i<num.length; i++){
            num[i] = getInput.nextInt();
        }
        int x = num[0];
        for(int j=1; j<num.length; j++){
            if(x>num[j]){
                x = num[j];
            }
        }
        System.out.println("Smallest Number : " + x);
    }
}
