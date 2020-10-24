package com.nyd.bank;

import com.nyd.bank.entity.Account;
import com.nyd.bank.entity.SavingAccount;

import java.util.Arrays;

public class Arraytest {
    public static void main(String[] args) {
        var media = 0;
        var valor = 0;
        SavingAccount sv1 = new SavingAccount();
        SavingAccount sv2= new SavingAccount();
        SavingAccount sv3 = new SavingAccount();
        SavingAccount sv4 = new SavingAccount();
        SavingAccount sv5 = new SavingAccount();

        sv1.setName("shdsoudsd");
        sv2.setName("seeewewewewe");
        sv3.setName("kkfkkkfkf");
        sv4.setName("cncnccncnnc");
        sv5.setName("kcmcjddddd");

        sv1.setAmount(500);
        sv2.setAmount(200);
        sv3.setAmount(300);
        sv4.setAmount(400);
        sv5.setAmount(600);

        SavingAccount[] accounts = new SavingAccount[5];
        accounts[0] = sv1;
        accounts[1] = sv2;
        accounts[2] = sv3;
        accounts[3] = sv4;
        accounts[4] = sv5;

        Arrays.stream(accounts).forEach(
                account -> System.out.println(account.getAmount())
        );

        for (SavingAccount account: accounts) {
            valor += account.getAmount();
        }


        media = valor / accounts.length;
        System.out.println(media);
    }

}
