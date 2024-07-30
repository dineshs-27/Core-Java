import java.util.HashMap;
import java.util.Scanner;

public class jewelsAndStones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter jewels: ");
        String jewels = sc.nextLine();
        System.out.println("Enter stones: ");
        String stones = sc.nextLine();
        System.out.println(counts(jewels, stones));
    }

    private static int counts(String jewels, String stones) {
        HashMap<Character, Boolean> jewelMap = new HashMap<>();

        for(int i=0; i<jewels.length(); i++){
            char jewel = jewels.charAt(i);
            jewelMap.put(jewel, true);
        }

        int count = 0;
        for(int i=0; i<stones.length(); i++){
            char stone = stones.charAt(i);
            if(jewelMap.containsKey(stone)){
                count++;
            }
        }
        return count;
    }
}