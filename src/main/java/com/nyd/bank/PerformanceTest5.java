package com.nyd.bank;

import com.sun.source.tree.Tree;

import java.util.*;

public class PerformanceTest5 {
    public static void main(String[] args) {
        Random newRandom = new Random();

        System.out.println("Starting now...");
        long start = System.currentTimeMillis();

        TreeSet set1 = new TreeSet();

        for (var i = 0; i < 1000; i++){

            set1.add(i);


        }

        Set set2 = (TreeSet) set1.descendingSet();
        System.out.println(set2);

        long end = System.currentTimeMillis();

        System.out.println("Time spent: " + (end - start));



        System.out.println("Starting now...");
        long start2 = System.currentTimeMillis();

       List list = new ArrayList();

        System.out.println("Starting now...");
        for (var i = 0; i < 1000; i++){

            list.add(i);


        }

        Collections.sort(list);
        Collections.reverse(list);

        System.out.println(list);

        long end2 = System.currentTimeMillis();

        System.out.println("Time spent: " + (end2 - start2));

    }
}
