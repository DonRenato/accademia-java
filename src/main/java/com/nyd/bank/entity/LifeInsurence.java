package com.nyd.bank.entity;

public class LifeInsurence implements Taxable {
    private double value;
    private String owner;
    private int insurenceNumber;


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getInsurenceNumber() {
        return insurenceNumber;
    }

    public void setInsurenceNumber(int insurenceNumber) {
        this.insurenceNumber = insurenceNumber;
    }

    @Override
    public double getTaxes() {
        return (this.value + 42.00) * 0.02;
    }

    public String getType(){
        return "Life Insurence";

    }
}
