package com.mevsungur.examTest;



/**
 * mevlut.sungur
 * 5.04.2021
 */
public class S18 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread18());
        Thread t2 = new Thread(new MyThread18());
        Thread t3 = new Thread(new MyThread18());

        t1.start();
        t2.run();
        t3.start();

        t1.start();
    }
}

class MyThread18 extends Thread {}
