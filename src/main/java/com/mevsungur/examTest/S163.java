package com.mevsungur.examTest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;

import static java.time.DayOfWeek.*;

/**
 * mevlut.sungur
 * 1.04.2021
 */
public class S163 {
    public static void main(String[] args) {
        MyInterface1 myInterface1 = () -> new Random().nextInt();
        MyInterface2 myInterface2 = () -> new Random().nextBoolean();
        //MyInterface3 myInterface3 = () -> "...";

        DayOfWeek dayOfWeek = LocalDate.now().with(TUESDAY).getDayOfWeek();

        switch (dayOfWeek) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("WEEKEND");
                break;
            case MONDAY:case FRIDAY:
                System.out.println("working");
            default:
                System.out.println("unknown");
        }
    }
}


interface MyInterface1 {
    public int method() throws Exception;

    private void pMethod() {}
}

interface MyInterface2 {
    public static void sMethod() {}
    public boolean equals();
}

interface MyInterface3 {
    public void method();
    public void method(String str);
}

interface MyInterface4 {
    public void dMethod();
    public void method(String str);
}

interface MyInterface5 {
    //public static void sMethod(); // Static methodun bodysi olmak zorundadır.
    public void method(String str);
}