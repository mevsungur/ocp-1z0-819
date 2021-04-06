package com.mevsungur;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * ÖNEML!!! *
 * mevlut.sungur
 * 29.03.2021
 */
public class UnaryOp1 {

    public static void main(String[] args) {
        UnaryOperator<String> opr1 = s -> {
            System.out.print(1);
            return s.toUpperCase();
        };
        UnaryOperator<String> opr2 = s -> {
            System.out.print(2);
            return new StringBuilder(s).reverse().toString().concat(".1");
        };
        UnaryOperator<String> opr3 = s -> {
            System.out.print(3);
            return s.substring(2);
        };

        Function<String, String> stringStringFunction = opr1.andThen(opr2).andThen(opr2);
        Function<String, String> compose = opr1.andThen(opr2).andThen(opr2).andThen(opr2).compose(opr3);

        System.out.println(compose.apply("mevlut1") + stringStringFunction.apply("mevlut")); //Line n1
        System.out.println(stringStringFunction.apply("mevlut"));
    }
}

interface Int1 {
    default  String testMethod() {
        return "def";
    }
}

class Cl1 implements Int1 {
    /*
    Interface nin default methodu olduğu için override etmeye gerek yok.
     */
}
