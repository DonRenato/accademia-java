package com.nyd.bank;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //exe 01
        System.out.println("");
        System.out.println("exe 01 =====================================");
        HashMap maps = new HashMap();

        maps.put(1, "Renato");
        maps.put(2, "Xuliana");
        maps.put(3, "Xulia");
        maps.put(4, "Xoão");

        System.out.println(maps);

        //exe 02
        System.out.println("");
        System.out.println("exe 02 =====================================");

        maps.forEach((k,v) ->{
            System.out.println(k);
            System.out.println(v);
        });

        //exe 03
        System.out.println("");
        System.out.println("exe 03 =====================================");

        System.out.println(maps.size());

        //exe 04
        System.out.println("");
        System.out.println("exe 04 =====================================");

        maps.keySet().removeAll(maps.keySet());
        System.out.println(maps);


        //exe 05
        System.out.println("");
        System.out.println("exe 05 =====================================");

        HashMap maps2 = new HashMap();

        maps2.put(1, "Renato");
        maps2.put(2, "Xuliana");
        maps2.put(3, "Xulia");
        maps2.put(4, "Xoão");
        maps2.put(5, "");

        System.out.println(maps.isEmpty());




        //exe 06
        System.out.println("");
        System.out.println("exe 06 =====================================");

        Map mapsCopy = new HashMap();
        mapsCopy.putAll(maps2);

        System.out.println(mapsCopy);

        //exe 07
        System.out.println("");
        System.out.println("exe 07 =====================================");

        System.out.println(maps2.containsKey(1));

        //exe 08
        System.out.println("");
        System.out.println("exe 08 =====================================");

        System.out.println(maps2.containsValue("Renato"));

        //exe 09
        System.out.println("");
        System.out.println("exe 09 =====================================");


        for (var key: maps2.keySet()) {
            var value = maps2.get(key);
            System.out.println(key + "=" + value);
        }


        //exe 10
        System.out.println("");
        System.out.println("exe 10 =====================================");

        System.out.println(maps2.get(3));

        //exe 11
        System.out.println("");
        System.out.println("exe 11 =====================================");

        for (var keys: mapsCopy.keySet()) {
            System.out.println(keys);
        }

        //exe 12
        System.out.println("");
        System.out.println("exe 12 =====================================");

        for (var values: mapsCopy.values()) {
            System.out.println(values);
        }

    }
}
