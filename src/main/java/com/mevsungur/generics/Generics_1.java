package com.mevsungur.generics;

/**
 * mevlut.sungur
 * 29.03.2021
 */
public class Generics_1 {
    public static <T> T get(T t) {
        return t;
    }

    public static void main(String[] args) {
        String str = get("HELLO");
        System.out.println(str);
    }
}