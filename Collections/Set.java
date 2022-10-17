package Collections;

import java.util.Arrays;

import java.util.HashSet;

public class Set {
    public static void main(String[] args){
        HashSet<Integer> obj1 = new HashSet<>();
        HashSet<Integer> obj2 = new HashSet<>();
        obj1.add(3);
        obj1.add(2);
        obj1.add(1);
        obj1.add(3);
        obj2.add(10);
        obj1.addAll(obj2);
            System.out.println(obj1);
            System.out.println(obj1.clone());
            System.out.println(Arrays.toString(obj1.toArray()));
            System.out.println(obj1.contains(7));
            System.out.println(obj1);
        }
    }