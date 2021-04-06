package com.mevsungur.stringbuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Java değişkenlerinin ismi class'lara verilebilir. Fakat çakışma olduğu durumlarda java değişkenlerine özel belirteç eklenmelidir.
 * String ile StringBuilder equals methodu ile kıyaslanabilir fakat false değeri döndürür.
 * StringBuilder değerini toString dedikten sonra kıyaslarsak equals methodu true dönecektir.
 * StringBuilder ile String == operatörünü uygulayamaz. Derleme hatası verir.
 * String.replace eşleşen tüm değerleri replace yapar.
 * String immutable bir değişkendir.
 *
 * StringBuilder sınıfı equals metodunu override etmemiştir, bu nedenle == metodunda false döner!
 * */


public class String_SB {
//    public static void main(String[] args) {
//        String str = "java";
//        StringBuilder sb = new StringBuilder("java");
//
//        System.out.println(str.equals(sb.toString()) + ":" + (sb.toString()==str));
//    }

    public static void main(String[] args) {
        String s = new String("Hellolololo");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hellolololo"));
        list.add(s);
        String replace = s.replace("lo", "Lo");
        System.out.println(replace);


        System.out.println(list);


        String str1 = null;
        String str2 = null;
        System.out.println(str1 = str2);

        int i=3;
        int j=5;
        System.out.println(i=j);
    }
}
