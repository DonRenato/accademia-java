package com.nyd.bank;

import com.nyd.bank.entity.Account;
import com.nyd.bank.entity.Bank;
import com.nyd.bank.entity.SavingAccount;

import java.lang.reflect.Array;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingAccount sv1 = new SavingAccount();
        SavingAccount sv2= new SavingAccount();
        SavingAccount sv3 = new SavingAccount();
        SavingAccount sv4 = new SavingAccount();
        SavingAccount sv5 = new SavingAccount();
        SavingAccount sv6 = new SavingAccount();
        SavingAccount sv7= new SavingAccount();
        SavingAccount sv8 = new SavingAccount();
        SavingAccount sv9 = new SavingAccount();
        SavingAccount sv10 = new SavingAccount();

        sv1.setName("shdsoudsd");
        sv2.setName("seeewewewewe");
        sv3.setName("kkfkkkfkf");
        sv4.setName("cncnccncnnc");
        sv5.setName("kcmcjddddd");
        sv6.setName("shdsoudsd");
        sv7.setName("seeewewewewe");
        sv8.setName("kkfkkkfkf");
        sv9.setName("cncnccncnnc");
        sv10.setName("kcmcjddddd");

        sv1.setAmount(500);
        sv2.setAmount(200);
        sv3.setAmount(300);
        sv4.setAmount(400);
        sv5.setAmount(600);
        sv6.setAmount(500);
        sv7.setAmount(200);
        sv8.setAmount(300);
        sv9.setAmount(400);
        sv10.setAmount(600);

        Account[] accounts = new Account[10];

        accounts[0] = sv1;
        accounts[1] = sv2;
        accounts[2] = sv3;
        accounts[3] = sv4;
        accounts[4] = sv5;
        accounts[5] = sv6;
        accounts[6] = sv7;
        accounts[7] = sv8;
        accounts[8] = sv9;
        accounts[9] = sv10;


        bank.setName("Banco Bamerindus");
        bank.setNumber(0654);
        bank.setAccounts(accounts);

        bank.showBank();

    }
}
