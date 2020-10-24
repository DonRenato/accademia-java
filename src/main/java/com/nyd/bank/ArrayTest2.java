package com.nyd.bank;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 43;
        array[1] = 2;
        array[2] = 55;
        array[3] = 12;
        array[4] = 65;

        System.out.println("Array normal");
        Arrays.stream(array).forEach(x -> System.out.println(x));

        int[] array2 = new int[6];
        array2[0] = 5;
        System.arraycopy(array, 0, array2, 1, array.length);


        int[] array3 = new int[6];
        System.arraycopy(array, 0, array3, 1, array.length);

        for (int i = 1; i < 4; i++){
            int aux = array3[i];
            array3[i-1] = aux;

        }

        array3[3] = 5;




        System.out.println("================================");
        System.out.println("Inserindo númerp no inicio do array");
        Arrays.stream(array2).forEach(x -> System.out.println(x));

        System.out.println("================================");
        System.out.println("Inserindo número no meio do array");
        Arrays.stream(array3).forEach(x -> System.out.println(x));
    }

}
