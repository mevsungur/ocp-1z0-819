package com.mevsungur.examTest;

import java.util.List;

/**
 * mevlut.sungur
 * 8.04.2021
 */
@Resource1(name = "")
public  class S68 {

    public static void main(String[] args) {
        List<Integer> of = List.of();
        of.add(1);
        System.out.println(of);
    }
}

@interface Resource1 {
    String name();
    int priority() default 0;
}
