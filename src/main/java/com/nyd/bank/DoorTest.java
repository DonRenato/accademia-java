package com.nyd.bank;

import com.nyd.bank.entity.Door;

public class DoorTest {
    public static void main(String[] args) {
        Door door = new Door();
        door.setDimensionX(10);
        door.setDimensionY(5);
        door.setDimensionZ(3);
        door.setColor("black");


        door.close();

        System.out.println(door.isOpen());
    }
}
