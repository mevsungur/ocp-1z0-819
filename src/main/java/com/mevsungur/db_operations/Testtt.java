package com.mevsungur.db_operations;

/**
 *
 * < işareti bir önceki argümanı işaret ediyor.
 * mevlut.sungur
 * 30.03.2021
 */
public class Testtt {
    public static void main(String[] args) {
        var console = System.console();
        if(console != null) {
            console.format("%d %<x", 10);
            console.format("%d %x", 10,10);
        }
    }
}
