import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kidsCandies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total kids: ");
        int kids = sc.nextInt();
        int[] candies = new int[kids];
        System.out.println("Enter the number of candies each kid have: ");
        for(int i=0; i<kids; i++){
            candies[i] = sc.nextInt();
        }
        System.out.println("Enter the extra candies: ");
        int extra = sc.nextInt();

        System.out.println(ans(candies, extra));
    }

    private static List<Boolean> ans(int[] candies, int extra) {
        List<Boolean> result = new ArrayList<>();

        int max = 0;
        for(int i=0; i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        for(int i=0; i<candies.length; i++){
            if(candies[i]+extra >= max ){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }

        return result;
    }
}