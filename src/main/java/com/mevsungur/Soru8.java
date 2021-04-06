package com.mevsungur;

import java.io.IOException;
/**
 * Multiple catch mekanizmasında önce Exception classını handle edersek alt classlar handle edilemez. Compile error verir.
 *
 * */

/**
 * @author mevlut.sungur
 */
public class Soru8 {
    public static void main(String[] args)  throws NullPointerException {
        X xobj = new X();
//        xobj.printFileContent();

        StringBuilder sb = new StringBuilder(5);
        sb.append("rgergsvsvbbrtb");
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        String st ="";
        if(sb2.toString().equals(st)) System.out.println("equal");
    }
}

class X {
    public void printFileContent() {
        try {
            throw new IOException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
