package com.mevsungur.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * CyclicBarrier 6 threadin sonuçlanmasını beklediği için 5 threadli bir pool
 * yapısı hiç bir zaman sonlanmayacaktır.
 */
public class CyclicBarrier_S1 {

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        var cb = new CyclicBarrier(6, () -> System.out.println("HURRAH!"));
        var es = Executors.newFixedThreadPool(5);
        IntStream.rangeClosed(1, 10)
                .parallel()
                .forEach(x -> es.submit(() -> cb.await()));

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        cb.await();
        es.shutdown();
    }
}
