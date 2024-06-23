package Java_Basic_Programs.Swaping_Number;

public class Bits_Operator {
    static void swap(int m, int n){
//      Optimize solution.
        m = m^n;
        n = m^n;
        m = m^n;
        System.out.println("Value of m : " + m + "\nValue of n : " + n);
    }

    public static void main(String[] args){
        int m = 10, n = 15;
        swap(m,n);
    }
}