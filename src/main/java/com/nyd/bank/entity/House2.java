package com.nyd.bank.entity;

public class House2 {
    private String color;
    private int firstDoor;
    private int secondDoor;
    private int thirdDoor;



    public void firstDoorOpen(){
        this.firstDoor = 1;
    }

    public void secondDoorOpen(){
        this.secondDoor = 1;
    }

    public void thirdDoorOpen(){
        this.thirdDoor = 1;
    }

    public void firstDoorClose(){
        this.firstDoor = 0;
    }

    public void secondDoorClose(){
        this.secondDoor = 0;
    }
    public void thirdDoorClose(){
        this.thirdDoor = 0;
    }



    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public int getFirstDoor() {
        return firstDoor;
    }

    public void setFirstDoor(int firstDoor) {
        this.firstDoor = firstDoor;
    }

    public int getSecondDoor() {
        return secondDoor;
    }

    public void setSecondDoor(int secondDoor) {
        this.secondDoor = secondDoor;
    }

    public int getThirdDoor() {
        return thirdDoor;
    }

    public void setThirdDoor(int thirdDoor) {
        this.thirdDoor = thirdDoor;
    }

    public int howManyDoors(){
        var cont = 0;

        if (firstDoor == 0 && secondDoor == 0 && thirdDoor == 0){
            cont = 0;
        }
        if( firstDoor == 1){
            cont++;
        }if(secondDoor == 1){
            cont++;
        }if(thirdDoor == 1){
            cont++;
        }

        return cont;
    }

    /*public void howManyDoors(){

        if( this.firstDoor == 1 && this.secondDoor == 1 && this.thirdDoor == 1){
            System.out.println("3 portas abertas");
        }else if ( this.firstDoor == 1 && this.secondDoor == 1){
            System.out.println("2 portas abertas");
        }else if( this.firstDoor == 1 && this.thirdDoor == 1){
            System.out.println("2 portas abertas");
        }else if ( this.secondDoor == 1 && this.thirdDoor == 1) {
            System.out.println("2 portas abertas");
        }else if( this.firstDoor == 1 || this.secondDoor == 1 || this.thirdDoor == 1){
            System.out.println("1 porta aberta");
        }else{
            System.out.println("nenhuma porta aberta");
        }

    }*/
}
