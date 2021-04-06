package com.mevsungur.examTest;

/**
 * Object tercih eder.
 * mevlut.sungur
 * 31.03.2021
 */
public class S12 {

    public void analyze(Object[] o) {
        System.out.println(o.getClass() + "...");
    }
    public void analyze(long[] o) {
        System.out.println(o.getClass() + "...");
    }
    public void analyze(Object o) {
        System.out.println(o.getClass() + "...");
    }

    public static void main(String[] args) {
        int [] nums = new int[10];
        new S12().analyze(nums);
    }
}
