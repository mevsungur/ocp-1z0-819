package com.mevsungur.examTest;

import java.sql.JDBCType;

/**
 * mevlut.sungur
 * 31.03.2021
 */
public class S4 {
}


class Foo {
    private void print() {
        System.out.println("Bonjour le monde!");
    }

    public void foo() {
        print();
    }
}

class Bar extends Foo {
    private void print() {
        System.out.println("Hello world!");
    }
    public void bar() {
        print();
    }

    public static void main(String[] args) {
        Bar b = new Bar();
        b.foo();
        b.bar();


    }
}