package com.mevsungur.examTest;

import java.util.ArrayList;
import java.util.List;

/**
 * mevlut.sungur
 * 6.04.2021
 */
public class S21 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        List list2 = List.copyOf(list1);
        //list2.add("C");
        list2.set(0,"C");

        List<List<String>> list3 = List.of(list1, list2);

        System.out.println(list3);
        System.out.println(list2==list1);
        System.out.println(list2.equals(list1));
        System.out.println(list1);
        System.out.println(list2);


    }
}
