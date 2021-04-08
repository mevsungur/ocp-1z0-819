package com.mevsungur.examTest;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * mevlut.sungur
 * 6.04.2021
 */
public class S80 {
    private int sum;

    public int compute() {
        int x = 0;
        while (x < 3) {
            sum += x++;
        }
        return sum;
    }

    public static void main(String[] args) {
        S80 s80 = new S80();
        int sum = s80.compute();
        sum = s80.compute();
        //s80.compute();
        System.out.println(sum);


        List<Integer> of = List.of();
        Optional<Integer> optInt = of.stream().filter(x -> x % 3 != 0).reduce((i, j) -> i + j);
        optInt.ifPresent(System.out::println);


        Foooooo bar = new barrrrrrrrrr();


    }
}

class Foooooo {
    public <T> Collection<T> foo(Collection<T> arg) {
        return null;
    }
}

class barrrrrrrrrr extends Foooooo {

//    @Override
//    public Collection<String> foo(Collection<String> arg) {
//        return null;
//    }

//    public <T> Collection<T> foo(Stream<T> arg) {
//        return null;
//    }
//
//    @Override
//    public <T> List<T> foo(Collection<T> arg) {
//        return null;
//    }

//    public <T> Collection<T> foo(Collection<T> arg) {
//        return null;
//    }


//    public <T> Collection<T> bar(Collection<T> arg) {
//        return null;
//    }
//
//    public <T> Iterable<T> foo(Collection<T> arg) {
//        return null;
//    }
}