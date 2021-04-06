package com.mevsungur.examTest;

import java.io.Serializable;

/**
 * Enum constructoru public, protected olamaz.
 * default ya da private olabilir.
 * mevlut.sungur
 * 1.04.2021
 */
public class S177 {
}

enum Color implements Serializable {
    R(1),G(2),B(3);
    int c;

    Color(int c) {
        this.c=c;
    }
}