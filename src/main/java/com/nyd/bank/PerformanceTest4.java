package com.nyd.bank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceTest4 {
    public static void main(String[] args) {
        System.out.println("Starting now...");
        long start = System.currentTimeMillis();

        List list1 = new ArrayList();

        list1.add(0, "oi");

        long end = System.currentTimeMillis();

        System.out.println("Time spent: " + (end - start));

        System.out.println("Starting now...");
        long start2 = System.currentTimeMillis();


        List list2 = new LinkedList();

        list2.add(0, "oi");

        long end2 = System.currentTimeMillis();

        System.out.println("Time spent: " + (end2 - start2));
    }
}
