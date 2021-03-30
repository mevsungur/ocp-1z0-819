package com.mevsungur.date_time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class OfLocalizedDate1 {

    public static void main(String [] args) {
        var date = LocalDateTime.of(2025, Month.JULY, 1, 10, 10);
        var formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        var formatterWithTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        var formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        var formatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        var formatter4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Full" + formatter.format(date));
        /* System.out.println("Full with time " + formatterWithTime.format(date)); */ // Hata alır, çünkü LocalDateTime, Timezone içermez.
                                                                                        // Böyle bir methodu localizedFormatter'a geçirince saatten dolayı hata fırlatılır.
        System.out.println(formatter2.format(date));
        System.out.println(formatter3.format(date));
        System.out.println(formatter4.format(date));
        System.out.println(Locale.getDefault());
    }
}

/**
 * 	                ofLocalizedTime	            ofLocalizedDate	            ofLocalizedDateTime
 * LocalTime	    MEDIUM, SHORT
 * LocalDate		                        FULL, LONG, MEDIUM, SHORT
 * LocalDateTime	MEDIUM, SHORT	        FULL, LONG, MEDIUM, SHORT	    MEDIUM, SHORT
 * ZonedDateTime	FULL, LONG, MEDIUM,     FULL, LONG, MEDIUM, SHORT       FULL, LONG, MEDIUM, SHORT
 *                  SHORT
 * OffsetDateTime	MEDIUM, SHORT	        FULL, LONG, MEDIUM, SHORT	    MEDIUM, SHORT
 */
