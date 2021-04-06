package com.mevsungur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 0 boyutlu bir dizi tanımlanmasında sakınca yoktur.
 * Sysoutun içinde sayı ile karakter(tek tırnak ile) yazılmak istendiğinde karakterin ascii değerini alır, text olarak almaz.
 * Sysoutun içine degisken1=degisken2 yazarsan degisken2'yi ekrana basar.
 *
 */
public class VeriTipleri {

    public static void main(String[] args) {
        Double [] arr = new Double[5];
        arr[0] = 5d;arr[1]=3d;
        System.out.println((arr[0] + arr[1]));

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("D");

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");

        list1.addAll(2, list2);

        System.out.println(list1);

        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);

        Character var=8;
        if(var==7) var=null;

        switch(var==null ? 0 : var) {
            case 7:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT" + var);
        }



        String [] fruits = {"apple", "banana", "mango", "orange"};
        int count=0;
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
            if (true) {
                continue;
            }
            System.out.println("salad!");

        }
    }
}


