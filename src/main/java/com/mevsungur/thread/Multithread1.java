package com.mevsungur.thread;

import java.time.LocalDateTime;
import java.util.IntSummaryStatistics;

/**
 * mevlut.sungur
 * 19.03.2021
 */
public class Multithread1 {

    public static void main(String[] args) {
        Runner runner1 = new Runner();
        Runner runner2 = new Runner();

        runner1.start();
        runner2.start();

        String.valueOf("2");

    }

}


class Runner extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(LocalDateTime.now() +" " + i + "\t" + this.getName());
        }
    }

}

class SgkUtil {
    public static void main(String[] args) {
        String tescilNo = "11629010113727090072012";
        Integer m = Integer.parseInt(tescilNo.substring(0,1));
        String iskolu = tescilNo.substring(1,5);
        String yeniSube = tescilNo.substring(5,7);
        String eskiSube = tescilNo.substring(7,9);
        String siraNo = tescilNo.substring(9,16);
        String ilKodu = tescilNo.substring(16,19);
        String ilceKodu = tescilNo.substring(19,21);
        String kontrolNo = tescilNo.substring(21,23);
        String araciKod = tescilNo.substring(23,26);

        System.out.println();
    }
}