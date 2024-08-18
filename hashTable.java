package DSA;
import java.util.HashMap;
import java.util.Scanner;

public class hashTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of entries in the table: ");
        int rows = sc.nextInt();

        HashMap<Integer, String> table = new HashMap<>(rows);
        for(int i=0; i<rows; i++){
            System.out.println("Enter the key: ");
            int key = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the value: ");
            String value = sc.nextLine();

            table.put(key, value);
        }
        System.out.println("Hashtable contents: " + table);
    }
}