package com.mevsungur.stringbuilder;

/**
 * Intern metodundan dönen stringlerin referansı birbirine eşittir.
 *
 */
public class StringBuilder1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Dream BIG");
        String s1 = sb.toString();
        String s2 = sb.toString();
        String s3 = sb.toString().intern();
        String s4 = sb.toString().intern();

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        System.out.println(s3 == s4);
    }
}
