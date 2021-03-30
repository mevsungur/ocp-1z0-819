package com.mevsungur.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class S1_ForkJoinPool {

    public static void main(String[] args) {

        long baslangic = System.currentTimeMillis();

        hesapla();

        System.out.println("süre " + (System.currentTimeMillis() - baslangic) + " ms");

    }

    private static void hesapla() {
        Map<Integer, Double> sonucMap = new ConcurrentHashMap<>();

        for (int i = 0; i < 1000000; i++) {

            double kare = Math.sqrt(i);
            double tan = Math.tan(kare);
            double cos = Math.cos(tan);

            double radians = Math.toRadians(cos);
            double degrees = Math.toDegrees(radians);

            double exp = Math.exp(degrees);

            double log10 = Math.log10(exp);

            double atan2 = Math.atan2(log10, 5);

            double sqrt = Math.sqrt(atan2 * atan2 + log10 * log10);

            double square = sqrt * sqrt;

            sonucMap.put(i, square);
        }
    }
}


class BolParcalaYonet {

    public static class Hesaplama extends RecursiveAction {

        int baslangic;
        int bitis;
        Map<Integer, Double> sonucMap;

        private static final int THRESHOLD = 100_000;

        public Hesaplama(int baslangic, int bitis, Map<Integer, Double> sonucMap) {
            this.baslangic = baslangic;
            this.bitis = bitis;
            this.sonucMap = sonucMap;
        }

        @Override
        protected void compute() {
            if (bitis - baslangic > THRESHOLD) {
                ForkJoinTask.invokeAll(altIslereBol());
            } else {
                hesapla();
            }
        }

        private void hesapla() {

            for (int i = baslangic; i <= bitis; i++) {

                double kare = Math.sqrt(i);
                double tan = Math.tan(kare);
                double cos = Math.cos(tan);

                double radians = Math.toRadians(cos);
                double degrees = Math.toDegrees(radians);

                double exp = Math.exp(degrees);

                double log10 = Math.log10(exp);

                double atan2 = Math.atan2(log10, 5);

                double sqrt = Math.sqrt(atan2 * atan2 + log10 * log10);

                double square = sqrt * sqrt;

                sonucMap.put(i, square);

            }

        }

        private List<Hesaplama> altIslereBol() {
            List<Hesaplama> subtasks = new ArrayList<>();

            int orta = baslangic + (bitis - baslangic) / 2;

             System.out.println("bas orta bitis " + baslangic + " " + orta + " " + bitis);

            subtasks.add(new Hesaplama(baslangic, orta, sonucMap));
            subtasks.add(new Hesaplama(orta + 1, bitis, sonucMap));

            return subtasks;
        }

    }

    public static void main(String[] args) {

        ForkJoinPool commonPool = ForkJoinPool.commonPool();

        long baslangic = System.currentTimeMillis();

        Map<Integer, Double> sonucMap = new ConcurrentHashMap<>();

        Hesaplama hesaplama = new Hesaplama(0, 1_000_000, sonucMap);

        commonPool.invoke(hesaplama);

        System.out.println("süre " + (System.currentTimeMillis() - baslangic) + " ms");

    }
}