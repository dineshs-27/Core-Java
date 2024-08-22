import java.util.Scanner;

public class reverseSentence {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sen = sc.nextLine();
        System.out.println(Soln(sen));
    }

    private static String Soln(String sen){
        String[] words = sen.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for(int i=words.length-1; i >= 0; i--){
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}