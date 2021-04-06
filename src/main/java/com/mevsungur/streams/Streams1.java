package com.mevsungur.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream üzerinde işlem yapıldıktan sonra,
 * aynı obje üzerinde tekrar işlem yapılamaz.
 * IllegalStateException
 */
public class Streams1 {

    public static void main(String[] args) {
        IntStream stream = "OCP".chars();
        stream.forEach(c -> System.out.print((char)c));
        System.out.println(stream.count());

        spread(3,4,5,6);
    }

    public static void spread(int... i) {
        int x = i[0];
    }
}
