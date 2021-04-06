package com.mevsungur.thread;

import java.sql.JDBCType;
import java.util.stream.IntStream;

/**
 * Mythread paralel çalışabiliyor fakat runnable çalıştığında ana thread onu bekliyor ??!
 * mevlut.sungur
 * 31.03.2021
 */
public class ThreadEx_3 {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        MyRunnable1 myRunnable1 = new MyRunnable1();

        // Start ardından join denildiğinde thread ana thread'e katılıyor.
        // myThread.start();
        //myThread.join();
        myThread.start();

        myRunnable1.run();



        IntStream.range(0,5).forEach(i -> {
            try {
                System.out.println("Main Thread " + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }
}


class MyThread extends Thread {

    protected Thread inThread;

    public MyThread() {
        this.inThread = new Thread(this,"com.mevsungur");
    }

    @Override
    public void run() {
        for(var i=0;i<5;i++) {
            System.out.println("InThread " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        IntStream.range(0,5).forEach(i -> {
            try {
                System.out.println("Runnable " + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }
}

class XXXX {

    public static void main(String[] args) {
        for(var i=0;i<10;i++) {
            switch (i%5) {
                case 2: i*=i;
                break;
                case 3:
                    i++;
                    break;
                case 1:
                case 4:
                    i++;
                    continue;
                default:
                    break;
            }
            System.out.println(i);
            i++;
        }
    }
}

 class A {

}
final class B extends A {
    public B(String str) {
    }
}

interface Builder {
    public A build(String str);
}

class BuilderImpl implements Builder {

    @Override
    public B build(String str) {
        return new B(str);
    }
}