package com.mevsungur.exceptions;

import java.util.Optional;
import java.util.OptionalInt;

class MyException extends Exception{}

public class S1 {
    public static void main(String[] args) {
        OptionalInt optional = OptionalInt.empty();
        // Compile error. checked System.out.println(optional.orElseThrow(MyException::new));
        try {
            System.out.println(optional.orElseThrow(MyException::new));
        } catch (MyException e) {

        }

        System.out.println(OptionalInt.empty());


    }
}