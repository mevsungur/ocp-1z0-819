package com.mevsungur.exceptions;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * mevlut.sungur
 * 29.03.2021
 */
class MyException1 extends RuntimeException {
    public void log() {
        System.out.println("Logging MyException");
    }
}

class YourException extends RuntimeException {
    public void log() {
        System.out.println("Logging YourException");
    }
}

public class S2_Exception_47 {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch(MyException | YourException ex){
          // Compile ERror!!!
            //  ex.log();
        }
    }
}

interface I1 {
    void m1() throws java.io.IOException;
}

class c4 implements I1 {

    @Override
    public void m1() {

    }


}

 class Test {
    static String var = "FRIENDS"; //Line n1
     public static void main(String[] args) {
         System.out.println(divide(5.0f, 2.0f));
         System.out.println(divide(1.0f, 0.0f));
         System.out.println(divide(0.0f, 0.0f));


     }

     public static int divide (float f1, float f2) {
         float res = f1 / f2;
         return (int)res;
     }
}

class Person {
    int id;
    String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "{" + id + ", " + name + "}";
    }

    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            Person p = (Person) obj;
            return this.id == p.id;
        }
        return false;
    }

    public int hashCode() {
        return Integer.valueOf(this.id).hashCode();
    }
}