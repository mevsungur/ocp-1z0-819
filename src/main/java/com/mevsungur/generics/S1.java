package com.mevsungur.generics;

/**
 * Generic'e tip vermiş bile olsan T vermiş gibi
 * davranır... (!)
 *
 * @param <String>
 */
class Printer<String> {
    private String t;
    Printer(String t){
        this.t = t;
    }
}

public class S1 {
    public static void main(String[] args) {
        Printer<Integer> obj = new Printer<>(100);
        System.out.println(obj);


    }
}
