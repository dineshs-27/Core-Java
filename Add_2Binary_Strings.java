package Java_Basic_Programs;

public class Add_2Binary_Strings {
    static String add(String x, String y){
        int a = Integer.parseInt(x,2);
        int b = Integer.parseInt(y,2);
        int sum = a + b;
        System.out.println(sum);
        String result = Integer.toBinaryString(sum);
        return result;
    }

    public static void main(String[] args){
        String x = "100101", y = "0110111";
        System.out.println(add(x,y));
    }
}