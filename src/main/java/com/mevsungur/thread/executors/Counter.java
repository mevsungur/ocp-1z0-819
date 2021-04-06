package com.mevsungur.thread.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * mevlut.sungur
 * 11.03.2021
 */
public class Counter implements Runnable {

    int from;
    int to;

    public Counter(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = from; i <= to; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }

    public static void main(String[] args) {

        Runnable counters[] = {new Counter(1, 10), new Counter(11, 20), new Counter(21, 30), new Counter(31, 40), new Counter(41, 50)};
        ExecutorService executor = Executors.newFixedThreadPool(5);
        System.out.println("Start");
        for (Runnable counter : counters)
            executor.execute(counter);

        executor.shutdown();
        while(!executor.isTerminated());
        System.out.println("Finish");
    }
}
