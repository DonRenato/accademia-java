package com.nyd.bank;

import java.util.Arrays;

public class TestArraySplit {
    public static void main(String[] args) {
        String phrase = "Socorram-me subi no ônibus em Marrocos";
        String[] words = phrase.split(" ");


        Arrays.stream(words).forEach(
            word -> System.out.println(word)
        );

        System.out.println("==============================");

        for (var i = 5; i >=0 ; i--){
            System.out.println(words[i]);
        }


    }
}
