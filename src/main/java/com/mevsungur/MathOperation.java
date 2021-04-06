package com.mevsungur;

import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

/**
 * mevlut.sungur
 * 18.03.2021
 */
public class MathOperation {

    public static void main(String[] args) {
        int a = 11, b=3;
        // Sonuç küsürlü çıkıyor dikkat!!
        double e = Math.round((double) a/b*100)/100.0;

        System.out.println(e);

        Optional.empty();



    }
}
