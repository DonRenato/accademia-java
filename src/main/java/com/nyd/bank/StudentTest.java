package com.nyd.bank;

import com.nyd.bank.entity.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student renato = new Student();
        renato.setName("Renato");
        renato.setAge(33);


        //int parabens = renato.happyBirthday();
        System.out.println(renato.happyBirthday());
    }
}
