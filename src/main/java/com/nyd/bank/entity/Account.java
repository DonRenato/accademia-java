package com.nyd.bank.entity;


import java.util.Random;

public abstract  class Account {
    private int number;
    private double amount = 1000;
    private String name;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Account() {
        Random newRandom = new Random();
        this.number = newRandom.nextInt(74838);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0){
            this.amount += depositAmount;
        }else{
            System.out.println("Só é aceito depositos maiores que R$0,00");
        }

    }

    public abstract void whithdraw(double withdrawAmount);

    public void transfer(Account accountNumber, double transferAmount){
         this.whithdraw(transferAmount);
         accountNumber.deposit(transferAmount);

    }

    public void accountIncome(){
        var newAmount = this.amount * 1.07;
        amount = newAmount;
    }


    @Override
    public String toString(){
        return  "\nname: " + this.name +
                "\nnumber: " + this.number +
                "\namount: " + this.amount;
    }

    public abstract  String getType();
}

