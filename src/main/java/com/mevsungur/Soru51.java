package com.mevsungur;

/**
 * @author mevlut.sungur
 */
public class Soru51 {
    public static void doSum(Integer x, Integer y) {
        System.out.println("1.metod");

    }

    public static void doSum(int x, int y) {
        System.out.println("2.metod");

    }

    public static void doSum(float x, float y) {
        System.out.println("3.metod");

    }

    public static void doSum(double x, double y) {
        System.out.println("4.metod");

    }

    public static void main(String[] args) {
        doSum(2,4);
        doSum(4,6.0);

    }
}
