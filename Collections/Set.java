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
        System.out.println("Set 1 : " + st1);
        System.out.println("Set 2 : " + st2);
        st1.addAll(st2);
        System.out.println("Add of Set 1&2 : " + st1);
        System.out.println(st1.clone());
        System.out.println(Arrays.toString(st1.toArray()));
        System.out.println(st1.contains(7));
        }
    }
