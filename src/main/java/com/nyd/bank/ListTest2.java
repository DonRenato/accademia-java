package com.nyd.bank;

import com.nyd.bank.entity.CheckingAccount;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ListTest2 {
    public static void main(String[] args) {
        Random newRandom = new Random();
        List accounts = new ArrayList();
        int maior = 0;

        for (var i = 0; i < 10; i++) {
            CheckingAccount acc = new CheckingAccount();
            acc.setAmount(newRandom.nextInt(100));
            accounts.add(i, acc);
        }

        System.out.println(accounts);

        System.out.println("======================================");


        List numbers = new ArrayList();

        for (var i = 0; i < 10; i++) {

            numbers.add(i, newRandom.nextInt(100));

        }

        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.swap(numbers,8, 0);
        System.out.println(numbers.get(0));



    }
}
