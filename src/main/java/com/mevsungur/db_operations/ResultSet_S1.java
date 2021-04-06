package com.mevsungur.db_operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * ResultSet absolut ve relative methodlarına - değer verirsen sondan başlar/geriye hareket eder.
 * TYPE_FORWARD_ONLY resultsette absolute veya relative methodları çağrılırse Exception fırlatılır.
 * rs.afterLast() metodu cursoru son satırın sonuna getirir.
 *
 *
 * mevlut.sungur
 * 30.03.2021
 */
public class ResultSet_S1 {

    public static void main(String[] args) throws SQLException {
        var url = "jdbc:postgresql://localhost:5433/ocp";
        var user = "postgres";
        var password = "postgres";
        var query = "Select ID, FIRSTNAME, LASTNAME, SALARY FROM public.EMPLOYEE ORDER BY ID";

        try (var con = DriverManager.getConnection(url, user, password);
             var stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             var rs = stmt.executeQuery(query);) {
            rs.absolute(-2);
            rs.relative(-1);
            rs.afterLast();
            System.out.println(rs.getInt(1));
        }
    }
}

class Base {
     static void print() { //Line n1
        System.out.println("BASE");
    }
}

class Derived extends Base {
     static void print() { //Line n2
        System.out.println("DERIVED");
    }
}

class Test {
    public static void main(String[] args) {
        Base b = null;
        Derived d = (Derived) b; //Line n3
        d.print(); //Line n4

        var date = LocalDate.of(2021, 11, 4);
        var formatter = DateTimeFormatter.ofPattern("DD-MM-uuuu");
        System.out.println(formatter.format(date));

        Function<Integer, Integer> f = x -> x + 10;
        Function<Integer, Integer> g = y -> y * y;

        Function<Integer, Integer> fog = g.compose(f); //Line n1
        Function<Integer, Integer> gof = f.andThen(g); //Line n1
        System.out.println(fog.apply(10));
        System.out.println(gof.apply(10));
    }
}


class Test2 {
    static int i1 = 10;
    int i2 = 20;

    int add() {
        return this.i1 + this.i2; //Line n1
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Test2().add()); //Line n2

        var prop = new Properties();
        var fis = new FileInputStream("C:\\Message.properties");
        prop.load(fis);
        System.out.println(prop.get("key1")); //Line n1
        //System.out.println(prop.get("key2", "Good Day!")); //Line n2
        System.out.println(prop.getProperty("key3", "Good Day!")); //Line n3
        System.out.println(prop.getProperty("key4")); //Line n4


    }
}

class sasaas {
    public static void main(String[] args) throws SQLException {

    }
}

interface I1 {
    public static void print(String str) {
        System.out.println("I1:" + str.toUpperCase());
    }
}

class C1 implements I1 {
    void print(String str) {
        System.out.println("C1:" + str.toLowerCase());
    }
}

class Outer {
    public void print( int x) {
        class Inner {
            public void getX() {
                System.out.println(x);
            }
        }
        Inner inner = new Inner();
        inner.getX();
    }
}
