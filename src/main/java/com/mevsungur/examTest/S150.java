package com.mevsungur.examTest;

/**
 * mevlut.sungur
 * 1.04.2021
 */
public class S150 {
    private final double value;

    //public S150() {
    //}

    public S150(String value) {
        this(Double.parseDouble(value));
    }
    public S150(double value) {
        this.value = value;
    }
}
