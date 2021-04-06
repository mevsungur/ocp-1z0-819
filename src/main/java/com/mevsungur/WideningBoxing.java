package com.mevsungur;

import java.util.TreeMap;

/**
 * mevlut.sungur
 * 29.03.2021
 */
public class WideningBoxing {
    /**
     * Widening boxing'den önce gelir.
     * @param args
     */
    public static void main(String[] args) {
        method(5);
    }

    private static void method(Integer i) {
        System.out.println("Integer");
    }

    private static void method(long i) {
        System.out.println("primitive long");
    }
}

class BoxingWidening2 {

    public static void main(String[] args) {
        method(5);
    }

    private static void method(int... i) {
        System.out.println("int...");
    }

    private static void method(Integer i) {
        System.out.println("WrapperInteger");
    }

}

/**
 * RUNTIME EXCEPTION
 */
class BoxingWidening3 {
    public static void main(String[] args) {
        //method(5);
    }
    private static void method(long... l) {
        System.out.println("long...");
    }

    private static void method(Integer... l) {
        System.out.println("Integer...");
    }
}
