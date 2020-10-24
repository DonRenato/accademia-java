package com.nyd.bank;


import com.nyd.bank.entity.CheckingAccount;
import com.nyd.bank.entity.Door;
import com.nyd.bank.entity.SavingAccount;

public class AccountTest {
    public static void main(String[] args) {


        SavingAccount pedro = new SavingAccount();
        pedro.setName("Pedro");

        pedro.whithdraw(200);

        CheckingAccount onizuka = new CheckingAccount();
        onizuka.setName("Onizuka");

        onizuka.whithdraw(200);

        System.out.println(pedro);
        System.out.println(onizuka);

    }


}

