import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password: ");
        String pass = sc.nextLine();
        System.out.println(checker(pass, pass.length()));
    }

    private static int checker(String pass, int length) {
        int cap = 0;
        int num = 0;

        if(length < 4){
            return 0;
        }

        if(pass.charAt(0) >= '0' && pass.charAt(0) <= '9'){
            return 0;
        }

        for(int i=0; i<length; i++){
            if(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
                cap++;
            }
            if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                num++;
            }
            if(pass.charAt(i) == ' ' || pass.charAt(i) == '/') {
                return 0;
            }
        }
        if(cap>=1 && num>=1){
            return 1;
        }else{
            return 0;
        }
    }
}