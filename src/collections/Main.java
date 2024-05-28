package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        ->List<Integer> is an interface reference, 
        ->ArrayList,LinkedList both are cleases under the category of Interfacr List
        ->ArrayList Implements List in the colection hierarchry in java
        ->LinkedList implements List in java

         */
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

//        list2.add(34);
//        list2.add(78);
//        list2.add(55);
//        list2.add(89);
//
//        System.out.println(list2);


        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(56);

        System.out.println(vector);
    }
}