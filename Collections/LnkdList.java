package Collections;

import java.util.LinkedList;

import java.util.List;

public class LnkdList {
    public static void main(String[] args){
        List lst1 = new LinkedList();
        List lst2 = new LinkedList();
        lst1.add("Dhoni");
        lst1.add("Virat");
        lst1.add("Raina");
        lst2.add("Rohit");
        lst2.add("Jadeja");
        System.out.println("List 1 = "+ lst1);
        System.out.println("List 2 = "+ lst2);
        System.out.println(lst1.contains(7));
        System.out.println(lst2.get(0));
    }
}
