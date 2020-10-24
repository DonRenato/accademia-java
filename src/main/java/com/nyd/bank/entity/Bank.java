package com.nyd.bank.entity;

import java.util.Arrays;

public class Bank {
    private String name;
    private int number;
    private Account[]  accounts = new Account[10];

    int cont = 0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add (Account account){
       this.accounts[cont] = account;
       cont++;

    }

    public void addTo (Account account){
       for (int i = 0 ; i < accounts.length; i++){
           if(accounts[i] == null){
               accounts[i] = account;
               break;
           }
       }
    }


    public void showBank() {

        System.out.println("nome: '" + name + '\'');
        System.out.println("nº: " + number);
        System.out.println("contas: ");
        for(int i = 0; i < this.accounts.length; i++){
            System.out.println(accounts[i]);;
        }
    }
}
