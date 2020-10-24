package com.nyd.bank;

import com.nyd.bank.entity.Door;
import com.nyd.bank.entity.House;

public class HouseTest {
    public static void main(String[] args) {
        House house = new House();
        house.setFirstDoor(new Door());
        house.setSecondDoor(new Door());
        house.setThirdDoor(new Door());

        house.setColor("green");

        house.getFirstDoor().setOpen(1);
        house.getThirdDoor().setOpen(1);

        house.howManyDoors();
        System.out.println(house.getColor());

    }
}
