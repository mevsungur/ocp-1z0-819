package com.mevsungur.examTest;

/**
 * mevlut.sungur
 * 6.04.2021
 */
public class S20 {

    public static void main(String[] args) {
        Worker w1 = new Worker();
        Worker w2 = new Worker();

        Resource r1= new Resource();
        Resource r2= new Resource();
        new Thread(() -> {
            w1.work(r1,r2);
        }).start();
        new Thread(() -> {
            w2.work(r2,r1);
        }).start();

        System.out.println("BİTTTİ");

    }
}

class Resource {
    public Worker owner;
    public synchronized boolean claim(Worker worker) {

        if(owner==null) {
            owner=worker;
            return true;
        }
        else
            return false;
    }

    public synchronized void release() {
        owner=null;
    }

}

class Worker {
    public synchronized void work(Resource... resources) {
        for(var i=0;i<10;i++) {
            while(!resources[0].claim(this)) {}
            while(!resources[0].claim(this)) {}
            System.out.println("work" + resources);
            resources[1].release();
            resources[0].release();
        }
    }
}
