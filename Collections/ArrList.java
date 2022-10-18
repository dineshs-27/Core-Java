package Collections;

import java.util.ArrayList;

import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        List lst1 = new ArrayList();
        List lst2 = new ArrayList();
        List lst3 = new ArrayList();
        lst1.add(1);
        lst1.add(2);
        lst2.add(3);
        lst2.add(3);
        lst3.add("Dinesh");
        lst3.add('S');
        System.out.println("List 1 = "+ lst1);
        System.out.println(lst1.get(1));
        lst1.remove(1);
        System.out.println("List 1 Modified : " + lst1);
        System.out.println("List 2 = "+ lst2);
        System.out.println("List 3 = "+ lst3);
        System.out.println(lst2.contains(7));
    }
}
