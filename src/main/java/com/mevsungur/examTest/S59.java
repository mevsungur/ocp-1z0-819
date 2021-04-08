package com.mevsungur.examTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * mevlut.sungur
 * 8.04.2021
 */
public class S59 {

    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{2, 1, 3, 4, 5};

        List<Integer> list = new ArrayList<>(Arrays.asList(intArray));

        //list.parallelStream().forEachOrdered(e -> System.out.println(e + " "));
        list.parallelStream().forEach(e -> System.out.println(e + " "));

        //list.replaceAll(i -> i.intValue());

        S58 s58 = new S58();
        System.out.println(s58.getNow());

    }
}
