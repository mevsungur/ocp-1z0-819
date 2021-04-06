package com.mevsungur.date_time;
/**
 * LocalDate.of sınıfı mevcutta olmayan bir ay,gün verildiğinde DateTimeException verir. Örn. 31 Eylül diyemeyiz. (Runtime Exception)
 * LocalDate sınıfı yyyy-MM-dd olarak ekrana yazdırıldı.
 * LocalDate getMonthValue methodu ayın kendi değerini yazar.
 * LocalDate getMonth ayın İngilizce ismini yazar.
 * Localdate getMonth.getDisplayName metoduna Locale bilgisi verilerek istenen dilde yazılabilir.
 * Basic_ISO_DATE formatı tarihi bitişik yazmaya yarar.
 * LocalDate getDayOfYear 365 günün içinde hangi gün olduğunu yazar.
 * LocalDate getDayOfWeek methodu günü İngilizce olarak ismini yazar.
 * LocalDate sınıfı extend edilemez. Finaldir.
 * */


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.function.Predicate;

public class Date_Time {
    public static void main(String [] args) {
        long baslangic = System.currentTimeMillis();
        LocalDate date = LocalDate.of(2020, 9, 30);
        System.out.println(date.getMonthValue());
        System.out.println(date.getMonth().firstMonthOfQuarter());
        System.out.println(date.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()));
        System.out.println(date.getChronology());
        System.out.println(date.getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.getDefault()));
        System.out.println(date.getDayOfYear());
        System.out.println(date.getEra());
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(date);
        System.out.println("İşlem süresi (ms) : " + (System.currentTimeMillis() - baslangic));
        System.out.println(10 != 5);

        try {
            main(args);
        } catch (Exception ex) {
            System.out.println("CATCH-");
        }
        System.out.println("OUT");

}
}
