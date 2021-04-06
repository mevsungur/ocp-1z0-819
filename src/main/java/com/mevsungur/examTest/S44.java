package com.mevsungur.examTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * mevlut.sungur
 * 6.04.2021
 */
public class S44 {


    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        print(list);

        int[] secA= {2,4,6,8,10};
        int[] secB= {2,4,8,6,10};

        System.out.println(Arrays.mismatch(secA,secB));
        System.out.println(Arrays.compare(secA,secB));

        List<Integer> of = List.of();

    }
    private static void print(List<String>... args) {
        for (List<String> str : args) {
            System.out.println(str);
        }
    }
}
