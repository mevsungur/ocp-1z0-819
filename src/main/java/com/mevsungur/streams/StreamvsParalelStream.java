package com.mevsungur.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * mevlut.sungur
 * 29.03.2021
 */
public class StreamvsParalelStream {

    public static void main(String[] args) throws IOException {
        var s1 = List.of("A", "E", "I", "O", "U").stream()
                .reduce("_", String::concat);
        var s2 = List.of("A", "E", "I", "O", "U").parallelStream()
                .reduce("_", (s, str) -> {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return s.concat(str);
                });
        try(var br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter any number between 1 and 10: ");
            var num = br.read();
            System.out.println(num);


        }
    }
}
