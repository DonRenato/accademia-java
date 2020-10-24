package com.nyd.bank;

import java.util.*;

public class ListTest {

    public static void main(String[] args) {

        Random newRandom = new Random();

        //exe01
        System.out.println("exe 01 -------------------------------------");
        System.out.println();
        List<String> cores = new ArrayList();

        cores.add("azul");
        cores.add("vermelho");
        cores.add("branco");

        System.out.println(cores);

        //exe02
        System.out.println("exe 02 -------------------------------------");
        System.out.println();
        cores.stream().forEach(color -> System.out.println(color));

        //exe03
        System.out.println("exe 03-------------------------------------");
        System.out.println();
        cores.add(0,"preto");
        System.out.println(cores);



        //exe04
        System.out.println("exe 04-------------------------------------");
        System.out.println();
        List<String> cores2 = new ArrayList();

        cores2.add("verde");
        cores2.add("laranja");
        cores2.add("roxo");
        List list = new ArrayList();

        list.add(cores);
        list.add(cores2);
        System.out.println(list);
        System.out.println(list.get(1));

        //exe05
        System.out.println("exe 05-------------------------------------");
        System.out.println();

        System.out.println(cores2);
        cores2.set(2, "salmão");
        System.out.println(cores2);

        //exe06
        System.out.println("exe 06-------------------------------------");
        System.out.println();

        System.out.println(cores);
        cores.remove(2);
        System.out.println(cores);

        //exe07
        System.out.println("exe 07-------------------------------------");
        System.out.println();

        System.out.println(cores2.contains("salmão"));

        //exe08
        System.out.println("exe 08-------------------------------------");
        System.out.println();

       Collections.sort(cores);
        System.out.println(cores);

        //exe09
        System.out.println("exe 09-------------------------------------");
        System.out.println();

        List cores3 = new ArrayList();
        cores3 = cores2;
        System.out.println(cores3);

        //exe10
        System.out.println("exe 10-------------------------------------");
        System.out.println();

        Collections.sort(cores3);
        System.out.println(cores3);

        //exe11
        System.out.println("exe 11-------------------------------------");
        System.out.println();

        System.out.println(cores);
        Collections.reverse(cores);
        System.out.println(cores);

        //exe12
        System.out.println("exe 12-------------------------------------");
        System.out.println();

        ArrayList colores = new ArrayList();
        colores.add("branco");
        colores.add("roxo");
        colores.add("lilás");
        colores.add("branco");
        colores.add("roxo");
        colores.add("lilás");
        colores.add("branco");
        colores.add("roxo");
        colores.add("lilás");

        System.out.println(colores.subList(0,5));


        //exe13
        System.out.println("exe 13-------------------------------------");
        System.out.println();

        System.out.println(cores2.equals(cores3));

        //exe14
        System.out.println("exe 14-------------------------------------");
        System.out.println();

        System.out.println(colores);
        Collections.swap(colores, 0,8);
        System.out.println(colores);

        //exe15
        System.out.println("exe 15-------------------------------------");
        System.out.println();

        List listAllTogether = new ArrayList();

        listAllTogether.addAll(cores2);
        listAllTogether.addAll(cores3);
        System.out.println(listAllTogether);

        //exe16
        System.out.println("exe 16-------------------------------------");
        System.out.println();

        List dollynho = (List) ((ArrayList<?>) listAllTogether).clone();
        System.out.println(dollynho);
        System.out.println(listAllTogether.equals(dollynho));

        //exe17
        System.out.println("exe 17-------------------------------------");
        System.out.println();

        dollynho.clear();
        System.out.println(dollynho);

        //exe18
        System.out.println("exe 18-------------------------------------");
        System.out.println();

        System.out.println(dollynho.isEmpty());

        //exe19
        System.out.println("exe 19------------------------------------");
        System.out.println();

        ArrayList numbers = new ArrayList();

       for (var i = 0; i < 10; i++){
           numbers.add(i, newRandom.nextInt(100));
       }

        System.out.println(numbers);

       numbers.set(1,666);
        System.out.println(numbers);

        //exe20
        System.out.println("exe 20------------------------------------");
        System.out.println();

        ListIterator it = numbers.listIterator(0);
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
