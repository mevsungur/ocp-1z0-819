package com.mevsungur.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadRunJoin1 {

    private AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        ThreadRunJoin1 application = new ThreadRunJoin1();
        application.doCount();
    }

    private void doCount() {
        var thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count.getAndAdd(1);
            }
        });


        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count.getAndAdd(1);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println("Sayaç: " + count);
    }
}
