package com.nyd.bank.entity;

public class Door {
    protected int open = 0;
    protected String color;
    protected int dimensionX;
    protected int dimensionY;
    protected int dimensionZ;

    public int getOpen() {
        return open;
    }

    public Door setOpen(int open) {
        this.open = open;
        return null;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDimensionX() {
        return dimensionX;
    }

    public void setDimensionX(int dimensionX) {
        this.dimensionX = dimensionX;
    }

    public int getDimensionY() {
        return dimensionY;
    }

    public void setDimensionY(int dimensionY) {
        this.dimensionY = dimensionY;
    }

    public int getDimensionZ() {
        return dimensionZ;
    }

    public void setDimensionZ(int dimensionZ) {
        this.dimensionZ = dimensionZ;
    }

    public void open(){
        if( open == 1){
            System.out.println("A porta já está aberta");
        }else{
            this.open = 1;
        }

    }

    public void close(){
        if( open == 0){
            System.out.println("A porta já está fechada");
        }else{
            this.open = 0;
        }
    }
     public void colorIt(String color){
        this.color = color;
    }

    public boolean isOpen() {
        if(this.open == 1){
            return  true;
        }else{
            return false;
        }
    }
}
