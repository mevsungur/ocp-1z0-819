package com.mevsungur.package2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

/**
 * mevlut.sungur
 * 26.03.2021
 */
public enum Beden {
    SMALL,MEDIUM,LARGE
}


class aaaa {
    private static void m(int i) {
        System.out.print(1);
    }

    private static void m(int i1, int i2) {
        System.out.print(2);
    }

    private static void m(char... args) {
        System.out.print(3);
    }

    public static void main(String... args) {
        m('A');
        m('A', 'B');
        m('A', 'B', 'C');
        m('A', 'B', 'C', 'D');
    }

    public static void change(int... arr) {
        int [] copy = arr.clone();
        copy[0]=111;

    }
}

class Counter {
    int count = 0;
}
interface SetCounter {
    void set(Counter ctr);
}
