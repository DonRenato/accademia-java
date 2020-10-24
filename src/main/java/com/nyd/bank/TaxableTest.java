package com.nyd.bank;

import com.nyd.bank.entity.CheckingAccount;
import com.nyd.bank.entity.LifeInsurence;
import com.nyd.bank.entity.Taxable;

public class TaxableTest {
    public static void main(String[] args) {
        CheckingAccount cc = new CheckingAccount();
        cc.deposit(10);
        System.out.println(cc.getTaxes());

        Taxable tax = cc;
        System.out.println(tax);


        LifeInsurence ls = new LifeInsurence();
        ls.setInsurenceNumber(48343);
        ls.setOwner("Renato");
        ls.setValue(2500);

        System.out.println(ls.getType());
        System.out.println(ls.getTaxes());




    }
}
