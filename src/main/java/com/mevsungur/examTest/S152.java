package com.mevsungur.examTest;

import java.util.*;

/**
 * mevlut.sungur
 * 1.04.2021
 */
public class S152 {

    public static void main(String[] args) {
        Foo152 f1 = new Foo152();
        Foo152 f2 = new Foo152();
        Bar152 b1 = new Bar152();

        Collection<String> c = new ArrayList<>();

        b1.foo(c);
        f1.foo(c);
        f1.foo(c);
        b1.foo(c);
        f2.foo(c);
        b1.foo(c);
        f2.foo(c);
        f2.foo(c);
        f1.foo(c);

        int i =1;
        for(String s : args ) {
            System.out.println((i++) + ") " + s);
        }

    }
}

class Foo152 {
    public void foo(Collection arg) {
        System.out.println("Bonjour le monde!");

    }
}

class Bar152 extends Foo152 {
    public void foo(Collection arg) {
        System.out.println("Hello world!");
    }

    public void foo(List arg) {
        System.out.println(" O la mundo !");
    }
}


