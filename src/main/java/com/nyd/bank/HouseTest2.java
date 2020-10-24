package com.nyd.bank;

import com.nyd.bank.entity.House2;

public class HouseTest2 {
    public static void main(String[] args) {
        House2 house = new House2();


        house.secondDoorOpen();
        house.firstDoorOpen();
        house.thirdDoorOpen();


        System.out.println(house.howManyDoors());
    }


}
