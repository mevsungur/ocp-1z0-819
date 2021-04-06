package com.mevsungur.examTest;

import java.util.Observable;

/**
 * mevlut.sungur
 * 1.04.2021
 */
public class S169 {

    public static void main(String... args) {
        System.out.println(args.getClass());
        System.out.println(args instanceof String[]);
        for(var x: args) {
            System.out.println(x);
        }


    }

    static void me() {
        main(new String[]{"..."});
    }
}

