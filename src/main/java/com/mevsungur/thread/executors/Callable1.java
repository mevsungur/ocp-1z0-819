package com.mevsungur.thread.executors;



import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Consumer;

/**
 * mevlut.sungur
 * 11.03.2021
 */

class CallableCounter implements Callable<Integer> {

    int from;
    int to;

    public CallableCounter(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
            sum = sum + i;
        }
        return sum;
    }
}

public class Callable1 {

    private int sayac=0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        CallableCounter counters[] = {new CallableCounter(1, 10),
                new CallableCounter(11, 20),
                new CallableCounter(21, 30),
                new CallableCounter(31, 40),
                new CallableCounter(41, 50),
                new CallableCounter(41, 50),
        };

        ExecutorService executor = Executors.newFixedThreadPool(5);
        System.out.println("Start");
        for (CallableCounter counter : counters) {
            Future<Integer> future = executor.submit(counter);
            Integer result = future.get();
            System.out.println("[Result]:" + result);
        }

        executor.shutdown();
        while (!executor.isTerminated());
        System.out.println("Finish");
    }
}


class ThreadRunner extends Thread {



    @Override
    public void run(){
        for (int i = 0;i<10;i++){
            System.out.println("Selam ben "+currentThread().getName()+", i'nin değeri = "+i);
        }
    }

    public static void main(String[] args) {

        StringConsumer consumer = new StringConsumer() {
            @Override
            public void accept(String s) {
                System.out.println(s.toLowerCase());
            }
        };
        List<String> list = Arrays.asList("Dr", "Mr", "Miss", "Mrs");
        list.forEach(consumer);
    }

}
class Resource1 implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource1");
    }
}

class Resource2 implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource2");
    }
}

interface StringConsumer extends Consumer<String> {
    @Override
    public default void accept(String s) {
        System.out.println(s.toUpperCase());
    }
}