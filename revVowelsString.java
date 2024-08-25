import java.util.Scanner;

public class revVowelsString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println(meth(str));
    }

    private static char[] meth(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        String vowels = "aeiouAEIOU";

        while(left < right){
            while(left < right && vowels.indexOf(arr[left]) == -1){
                left++;
            }
            while(left < right && vowels.indexOf(arr[right]) == -1){
                right--;
            }

            if(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return arr;
    }
}