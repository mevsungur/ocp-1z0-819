package com.mevsungur.classes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Sınıfın kendi adıyla aynı adda metodu olabilir. Bu constructor yerine geçmez.
 * byte veri tipi -128 ve +127 aralığında değer alır. switch ifadesinde byte için 127'den büyük değer olursa Compile Error!
 * Listeden remove ile veri silmek istiyorsan objenin kendisini geçirmelisin. new ile yeni obje giderse silinmez.
 *
 * */
public class SiniflarGenel {
    public static void main(String[] args) {


        LocalDate startDate = LocalDate.of(2015, 2, 20);
        LocalDate endDate = LocalDate.of(2017, 1, 15);

        Period period2 = Period.between(startDate, endDate);
        System.out.println(period2);


        LocalDate date = LocalDate.of(2012, 05, 11);
        Period period = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.print(formatter.format(date.minus(period)));


        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove((Character)'O');
        }

        for(char ch : list) {
            System.out.print(ch);
        }


        int i = '5';
        m(i);
        m('5');



    }
    private static void m(int x) {
        System.out.println("int version");
    }

    private static void m(char x) {
        System.out.println("char version");
    }
}



//class Student {
//    private String name;
//    private int age;
//
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String toString() {
//        return "Student[" + name + ", " + age + "]";
//    }
//}
