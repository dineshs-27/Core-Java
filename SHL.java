import java.util.Scanner;

public class SHL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println(asw(n));
    }

    private static Character asw(int n) {
        char answer = 'X';

        if(n >= 30 && n <= 50){
            answer = 'D';
        }
        else if(n >= 51 && n <= 60){
            answer = 'C';
        }
        else if(n >= 61 && n <= 80){
            answer = 'B';
        }
        else if(n >= 81 && n <= 100){
            answer = 'A';
        }

        return answer;
    }
}