package Learn;

public class Swap {
    public static void main(String[] args){
        int a,b;
        a = 27;
        b = 3;
        System.out.println("Before Swapping : "+a+" "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping : "+a+" "+b);
    }
}