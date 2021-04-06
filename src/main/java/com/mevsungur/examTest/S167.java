package com.mevsungur.examTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * mevlut.sungur
 * 1.04.2021
 */
public class S167 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.Category.FORMAT,Locale.ENGLISH);

        LocalDate d1 = LocalDate.of(1997,2,7);
        DateTimeFormatter dtf =
                DateTimeFormatter.ofPattern( "eeee dd'th of' MMM yyyy" );
        System.out.println(dtf.format (d1));

        System.out.println(DateTimeFormatter.ofPattern( "eeee d'th of' MMMM yyyy" ).format(d1));
    }
}
