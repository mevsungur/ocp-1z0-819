package com.mevsungur.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

class MyCallable implements Callable<Integer> {
    private Integer i;

    public MyCallable(Integer i) {
        this.i = i;
    }

    public Integer call() throws Exception {
        return --i;
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("run()");
    }
}

public class Callable2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var es = Executors.newSingleThreadExecutor();
        var callable = new MyCallable(1);
        System.out.println(es.submit(callable).get());


        es.shutdown();
    }
}
