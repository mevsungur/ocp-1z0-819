package com.mevsungur;

import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author mevlut.sungur
 */
public class Soru13 {
    public static void main(String[] args) {
        //List<? super Float> list = new ArrayList<Double>();


    }
}

class Hello {

    class Greeting {
        void sayHi(){

        }

    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        Greeting greeting = hello.new Greeting();
        greeting.sayHi();
    }
}

