import java.util.Scanner;

public class canPlaceFlowers {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the flowerbed length: ");
        int len = sc.nextInt();
        int[] flowerbed = new int[len];
        System.out.println("Enter the elements 0s and 1s: ");
        for(int i=0; i<len; i++){
            flowerbed[i] = sc.nextInt();
        }
        System.out.println("Enter the number of flower to plant: ");
        int n = sc.nextInt();

        System.out.println(answer(flowerbed,n));
    }

    private static boolean answer(int[] flowerbed, int n) {
        if(n == 0){
            return true;
        }

        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i+1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)){
                n--;
                if(n==0){
                    return true;
                }
                flowerbed[i] = 1;
            }
        }
        return false;
    }
}