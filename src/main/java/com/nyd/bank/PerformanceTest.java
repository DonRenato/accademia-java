package com.nyd.bank;

import java.util.ArrayList;
import java.util.Random;

public class PerformanceTest {
    public static void main(String[] args) {
        Random newRandom = new Random();
        ArrayList numbers = new ArrayList();


        long start = System.currentTimeMillis();
        System.out.println("Starting now...");
        for (var i = 0; i < 30000; i++){

            numbers.add(i, newRandom.nextInt());


        }

        long end = System.currentTimeMillis();
        System.out.println("Time spent: " + (end - start));

        System.out.println("=====================================");

        long start2 = System.currentTimeMillis();
        System.out.println("Starting now...");

        for (var number: numbers) {
            System.out.println(number);
        }

        long end2 = System.currentTimeMillis();
        System.out.println("Time spent: " + (end2 - start2));
    }
}
