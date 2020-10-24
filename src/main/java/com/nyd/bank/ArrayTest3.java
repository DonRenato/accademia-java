package com.nyd.bank;

import java.util.Arrays;

public class ArrayTest3 {
    public static void main(String[] args) {
        int res = 0;
        int[] array = {2,3,4,4,2,3,5};



        Arrays.stream(array).forEach(x -> System.out.println(x));

        System.out.println("==============================");

        for(int i = 0; i < array.length ; i++){
            res = res ^ array[i];
        }

        System.out.println(res);




    }
}
