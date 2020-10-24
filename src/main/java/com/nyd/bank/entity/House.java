package com.nyd.bank.entity;

public class House {
    protected String color;
    private Door firstDoor;
    private Door secondDoor;
    private Door thirdDoor;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Door getFirstDoor() {
        return firstDoor;
    }

    public void setFirstDoor(Door firstDoor) {
        this.firstDoor = firstDoor;
    }

    public Door getSecondDoor() {
        return secondDoor;
    }

    public void setSecondDoor(Door secondDoor) {
        this.secondDoor = secondDoor;
    }

    public Door getThirdDoor() {
        return thirdDoor;
    }

    public void setThirdDoor(Door thirdDoor) {
        this.thirdDoor = thirdDoor;
    }

    public void openFirstDoor(){
        this.getFirstDoor().open = 1;
    }

    public void openSecondDoor(){
        this.getSecondDoor().open = 1;
    }

    public void openThirdDoor(){
        this.getThirdDoor().open = 1;
    }

    public void closeFirstDoor(){
        this.getFirstDoor().open = 0;
    }

    public void closeSecondDoor(){
        this.getSecondDoor().open = 0;
    }

    public void closeThirdDoor(){
        this.getThirdDoor().open = 0;
    }

    public void howManyDoors(){

        if( this.firstDoor.getOpen() == 1 && this.secondDoor.getOpen() == 1 && this.thirdDoor.getOpen() == 1){
            System.out.println("3 portas abertas");
        }else if ( this.firstDoor.getOpen() == 1 && this.secondDoor.getOpen() == 1){
            System.out.println("2 portas abertas");
        }else if( this.firstDoor.getOpen() == 1 && this.thirdDoor.getOpen() == 1){
            System.out.println("2 portas abertas");
        }else if ( this.secondDoor.getOpen() == 1 && this.thirdDoor.getOpen() == 1) {
            System.out.println("2 portas abertas");
        }else if( this.firstDoor.getOpen() == 1 || this.secondDoor.getOpen() == 1 || this.thirdDoor.getOpen() == 1){
            System.out.println("1 porta aberta");
        }else{
            System.out.println("nenhuma porta aberta");
        }

    }
}
