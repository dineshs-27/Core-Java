import java.util.Scanner;

public class differeceOfSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        System.out.println("Enter the m: ");
        int m = sc.nextInt();
        System.out.println(dos(n, m));
    }

    private static int dos(int n, int m) {
        int sumn = 0;
        int summ = 0;
        for(int i=1; i<=m; i++){
            if(i%n == 0){
                sumn = sumn + i;
            }
            else{
                summ = summ + i;
            }
        }
        return Math.abs(sumn - summ);
    }
}