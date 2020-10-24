package com.nyd.bank;

import com.nyd.bank.entity.Bank;
import com.nyd.bank.entity.SavingAccount;

import java.util.Arrays;

public class BankTest2 {
    public static void main(String[] args) {

        Bank bank = new Bank();
        SavingAccount sv1 = new SavingAccount();
        SavingAccount sv2 = new SavingAccount();
        SavingAccount sv3 = new SavingAccount();

        sv1.setName("shdsoudsd");
        sv1.setAmount(500);

        sv2.setName("dddddudsd");
        sv2.setAmount(5000);

        bank.add(sv1);
        bank.addTo(sv2);

        sv2.setName("cueba");
        sv2.setAmount(234);



        bank.showBank();









    }
}
