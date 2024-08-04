import java.util.Scanner;

public class binaryString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        String result = getSmallestString(S);
        System.out.println(result);
    }

    public static String getSmallestString(String S){
        StringBuilder sb = new StringBuilder(S);
        boolean found;

        do{
            found = false;
            for(int i=0; i<sb.length()-1; i++){
                if(sb.charAt(i) == '1' && sb.charAt(i+1) == '0'){
                    sb.deleteCharAt(i);
                    found = true;
                    break;
                }
            }
        }
        while(found);
        return sb.toString();
    }
}