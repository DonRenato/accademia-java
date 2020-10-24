package com.nyd.bank.entity;

public class CheckingAccount extends Account implements Taxable {
    @Override
    public String getType(){
        return "Checking Account";
    }

    @Override
    public void whithdraw(double withdrawAmount) {
        var amount  = getAmount();


        if (amount > withdrawAmount) {
            setAmount((amount -= withdrawAmount) - 0.10);

        } else {
            System.out.println("Saque não permitido. Saldo insuficiente");
        }
    }

    @Override
    public double getTaxes() {
        return (getAmount() * 0.01);

    }
}
