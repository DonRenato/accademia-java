package com.nyd.bank;

import java.lang.reflect.Array;
import java.util.*;

public class HashTest {
    public static void main(String[] args) {
        //exe 01
        System.out.println("");
        System.out.println("exe 01 ================================");

        Set numbers = new HashSet<>();
        Set numbers2 = new HashSet<>();
        Set numbers3 = new HashSet<>();

        numbers3.add(5);
        numbers3.add(3);
        numbers3.add(15);
        numbers3.add(56);
        numbers3.add(555);

        numbers2.add(5);
        numbers2.add(3);
        numbers2.add(15);
        numbers2.add(11);
        numbers2.add(555);

        System.out.println(numbers);

        //exe 02
        System.out.println("");
        System.out.println("exe 02 ================================");

        for ( var number: numbers){
            System.out.println(number);
        }

        //exe 03
        System.out.println("");
        System.out.println("exe 03 ================================");

        System.out.println(numbers.size());

        //exe 04
        System.out.println("");
        System.out.println("exe 04 ================================");

        numbers.clear();
        System.out.println(numbers);

        //exe 05
        System.out.println("");
        System.out.println("exe 05 ================================");

        System.out.println(numbers.isEmpty());

        //exe 06
        System.out.println("");
        System.out.println("exe 06 ================================");

        Set dollynho = (Set) ((HashSet<?>) numbers2).clone();
        System.out.println(numbers2);
        System.out.println(dollynho);

        //exe 07
        System.out.println("");
        System.out.println("exe 07 ================================");

        Integer[] arrayNumbers = new Integer[(numbers2.size())];
        numbers2.toArray(arrayNumbers);
        for (var number: numbers2){
            System.out.println(number);
        }

        //exe 08
        System.out.println("");
        System.out.println("exe 08 ================================");

        Set tree = new TreeSet(numbers2);

        System.out.println(tree);





        //exe 09
        System.out.println("");
        System.out.println("exe 09 ================================");
        List listNumbers = new ArrayList(numbers2);
        System.out.println(numbers2);
        Collections.sort(listNumbers);

        //exe 10
        System.out.println("");
        System.out.println("exe 10 ================================");

        System.out.println(numbers2.equals(numbers));

        //exe 11
        System.out.println("");
        System.out.println("exe 11 ================================");

        Set repeatList = new HashSet();

        numbers2.retainAll(numbers3);

        repeatList.addAll(numbers2);

       System.out.println(repeatList);

        //exe 12
        System.out.println("");
        System.out.println("exe 12 ================================");

        numbers3.removeAll(numbers3);

        System.out.println(numbers3);








    }
}
