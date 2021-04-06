package com.mevsungur;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * NOT: LOCAL DATE DEĞİŞKENİNİNİ DATETİME FORMATTER İLE FORMATLAYAMAZSIN.
 */
public class Soru3 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2014-05-04");
        System.out.println(localDate.getDayOfWeek());

        System.out.println(LocalDate.parse("2014-05-04"));
        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }

    /** Soru 2**/
    public void deneme() {
        ArrayList<Vehicle> myList = new ArrayList<>();
        myList.add(new Motorcycle());
    }

}

interface Vehicle {

}
class Motorcycle implements Vehicle {

}
