package com.mevsungur.thread;

import java.util.concurrent.Callable;
import java.util.stream.IntStream;

public class Callable1 implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Callable method ok..." + Thread.currentThread().getName());
        return "Callable method ok..." + Thread.currentThread().getName();
    }

    public static void main(String[] args) throws Exception {
        Callable1 callable1 = new Callable1();
        Callable1 callable12 = new Callable1();

        IntStream.range(0,10).forEach(i -> {
            try {
                String call = callable1.call();
                String call1 = callable12.call();
            } catch (Exception e) {
                e.printStackTrace();
            }

        });




    }
}
