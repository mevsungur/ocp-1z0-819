package com.mevsungur.thread.executors;

import java.util.concurrent.Executors;

/**
 *
 * Executorun run diye bir methodu yoktur.
 *
 * mevlut.sungur
 * 29.03.2021
 */
public class Executors4 {

    public static void main(String[] args) {
        var es = Executors.newFixedThreadPool(1);
        /*INSERT*/

        es.shutdown();
    }
}

class Printer implements Runnable {
    public void run() {
        System.out.println("Printing");
    }
}
