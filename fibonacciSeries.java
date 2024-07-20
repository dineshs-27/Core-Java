import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt(), first = 0, second = 1;
        System.out.print(first + " " + second);
        fibo(num, first, second);
    }

    private static void fibo(int num, int first, int second) {
        for(int i=2; i<=num; i++){
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}