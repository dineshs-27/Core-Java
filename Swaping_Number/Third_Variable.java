package Java_Basic_Programs.Swaping_Number;

public class Third_Variable {
    static void swap(int m, int n){
        int temp;
        temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m : " + m +"\nValue of n : " + n);
    }

    public static void main(String[] args){
        int m = 10, n = 15;
        swap(m,n);
    }
}