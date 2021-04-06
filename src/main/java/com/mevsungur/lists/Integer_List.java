package com.mevsungur.lists; /**
 * List.remove metodu listedeki sondan değil, ilk eklenen elemandan başlayarak silmeye çalışır.
 * List.remove eğer obje yoksa hiçbir işlem yapmaz. Hata fırlatmaz.
 * List Integer tipindeyse remove metoduna sayı girildiğinde bunu index olarak algılar. Integer tipine cast yapılırsa object olarak anlayacaktır.
 * List.remove içine index aldığında, eğer o index yoksa runtimeException fırlatır. !!!!!!!!!
 * List.remove içinde character verirsen onu index kabul eder.
 * List.remove içine - değer verildiğinde compile error vermez. Runtime verir. (IndexOutofbounds..)
 * List.clear listeyi tamamen boşaltır.
 * List.removeIf içine Predicate alır, predicate'e uygun tüm değerleri siler.
 * Byte ile Integer toplanabilir. Short ile Integer toplanabilir. Sonuclar integer olacaktır.
 * Double - Long'a cast edilemez. Long double'a cast edilebilir.
 * Float ve double toplanınca elde double olur.
 * İki farklı veritipinin aritmetik işlem sonucu primitivedir.
 * Farklı paket üzerinden erişebilmenin tek yolu erişim belirleyicinin "public" olmasıdır.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class Integer_List {
    public static void main(String[] args) {

        byte pbyte= 22;
        short pshort=3300;
        int pint = 222;
        float pfloat=22.2F;
        long plong = 222L;
        double pdouble=422;

        int num[][] = new int[1][3];

        for(int i =0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++) {
                num[i][j]=10;
            }
        }


        Byte byteSayi = 11;
        Short shortSayi = 2000;
        Integer intSayi=400;

        Long longSayi = 4L;
        Double doubleSayi= 5D;
        Float floatSayi=77.2F;

        String[][][] stA = new String[4][5][];
        stA[0] = new String[2][];
        stA[1]= new String[5][];
//        stA[0][0][0] ="rt";
        System.out.println(stA.length);

        List<String> names = new ArrayList<>();

        names.add("ilk");
        names.add("mevlut");
        names.add("sungur");
        names.add("mevlut");

        names.remove("mevlut");
        names.forEach(System.out::println);

//        long l = (Integer) intSayi + longSayi;
//        double v = (Long) doubleSayi + longSayi;
//        double d = (double) l;
//        Integer i = (Integer) shortSayi + intSayi;
//        Long s3 = (Long) shortSayi+ intSayi;
//        Short s9 = (Short) intSayi+byteSayi;
//        System.out.println(byteSayi+intSayi);
        double v1 = floatSayi + doubleSayi;


        int s = (int) plong; /** long int'e cast edilebilir. */
//        Double dee = (double) floatSayi;
//        Double de2= (double) pfloat;
//        Double dee22 = (Double) floatSayi;
//        Double de222= (Double) pfloat;

//        List<Integer> list = new ArrayList<>();
//        list.add(1050);
//        list.add(200);
//        list.add(100);
//        list.add(200);
//        list.add(100);
////        list.remove(2);
//
//        System.out.println(list.contains(100));
//        System.out.println(list.contains(100L));
//        list.removeIf(i -> i==100);
//
//
//        List<String> strList = new ArrayList<>();
//
//        strList.add("mevlut");
//        strList.add("sungur");
//        strList.add("mevlut");
//
//        strList.remove("mevlut");
//        System.out.println(list);
//        System.out.println(strList);

    }
}
