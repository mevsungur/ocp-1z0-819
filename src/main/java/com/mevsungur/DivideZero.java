package com.mevsungur;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * mevlut.sungur
 * 29.03.2021
 */
public class DivideZero {

    public static void main(String[] args) {

        var nf = NumberFormat.getIntegerInstance();
        String format = nf.format(-1.5);
        String format1 = nf.format(-2.5);
        System.out.println(format.equals(format1));

        System.out.println(((double) 120) / (double) 0);
        System.out.println(((byte) 120) / (byte) 0);
    }
}

class Util {
    int ctr = 0;
    private static Util obj;
    private Util() {
        ++ctr;
    }
    static synchronized Util get() {
        if(obj == null)
            obj = new Util();
        return obj;
    }
}

abstract class Planet1 {
    protected void revolve() {

    }
    abstract void rotate();
}

 class Earth2 extends Planet1 {
     public void revolve() {

    }
     protected void rotate() {

     }
}