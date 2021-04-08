package com.mevsungur.examTest;

import java.time.LocalDate;
import java.util.function.Function;

import static java.time.DayOfWeek.TUESDAY;

/**
 * mevlut.sungur
 * 1.04.2021
 */
public class S150 {
    private final double value;

    //public S150() {
    //}

    public static void main(String[] args) {
        System.out.println(LocalDate.now().with(TUESDAY).getDayOfWeek());

    }

    public S150(String value) {
        this(Double.parseDouble(value));
    }
    public S150(double value) {
        this.value = value;
    }
}

@FunctionalInterface
interface funccc {
    public abstract void x();


}

