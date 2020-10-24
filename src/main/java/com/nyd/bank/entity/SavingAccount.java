package com.nyd.bank.entity;

public class SavingAccount extends  Account {
    @Override
    public String getType(){
        return "Saving Account";

    }

    @Override
    public void whithdraw(double withdrawAmount) {
            var amount  = getAmount();

            if (amount > withdrawAmount) {
                setAmount(amount -= withdrawAmount);

            } else {
                System.out.println("Saque não permitido. Saldo insuficiente");
            }

    }


}
