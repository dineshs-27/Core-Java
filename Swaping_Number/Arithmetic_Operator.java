package Java_Basic_Programs.Swaping_Number;

public class Arithmetic_Operator {
    public static void main(String[] args){
        int m = 10, n = 15;
        System.out.println("Before swap m & n : " + m + " : " + n);
        m = (m + n) - (n = m);
        System.out.println("After swap m & n : " + m + " : " + n);
    }
}