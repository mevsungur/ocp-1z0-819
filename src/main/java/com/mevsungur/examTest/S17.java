package com.mevsungur.examTest;

/**
 * mevlut.sungur
 * 8.04.2021
 */
public class S17 {
    public static void main(String[] args) {
        System.out.println(Alphabet.getFirstLetter());
    }
}

enum Alphabet {
    A,B,C;

    static String getFirstLetter() {
        return A.toString();
    }
}

