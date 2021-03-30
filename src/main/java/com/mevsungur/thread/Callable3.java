package com.mevsungur.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class Callable3 {

    public static void main(String [] args) throws Exception {
        Callable<String> r = () -> {
            int sum = 0;
            for(int i = 1; i < 1000; i++) {
                sum += i / new Random().nextInt(50);
            }
            return "" + sum;
        };

        var es = Executors.newSingleThreadExecutor();
        var f = es.submit(r);
        System.out.println(f.get()); //Line n1
        es.shutdown();
    }
}
