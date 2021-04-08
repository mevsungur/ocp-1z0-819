package com.mevsungur.examTest;

import java.util.function.BiFunction;

/**
 * mevlut.sungur
 * 1.04.2021
 */
public class S171 {

    public static void main(String[] args) {
        Pair<String> p = new Pair<String>((x,y) -> x.equals(y), "AA","AA");
        boolean valid = p.isValid();
        System.out.println(valid);
    }
}

class Pair<T> {
    final BiFunction<T, T, Boolean> validator;
      T left = null;
      T right = null;

    private Pair() {
        validator = null;
    }

    Pair(BiFunction<T, T, Boolean> v, T x, T y) {
        validator = v;
        set(x, y);

    }

    void set(T x, T y) {
        if(!validator.apply(x,y)) throw new IllegalArgumentException();
        setLeft(x);
        setRight(y);
    }

    void setLeft(T x) {
        left=x;
    }
    void setRight(T y) {
        right = y;
    }

    final boolean isValid() {
        return validator.apply(left,right);
    }
}