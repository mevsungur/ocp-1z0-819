package com.mevsungur.examTest;

import java.util.Random;
import java.util.stream.DoubleStream;

/**
 * mevlut.sungur
 * 31.03.2021
 */
public class S2 {

}

interface Habitat {
    int x=0;
    abstract void inhabit();


}

interface Forest extends Habitat{
    default void inhabit() {}
}

interface Town extends Habitat {
    default void inhabit() {}
}
// Yalnızca birini implement ederse compile hatası oluşmuyor ???
class Fox implements Forest {


    public static void main(String[] args) {
        DoubleStream.generate(new Random()::nextDouble).limit(100).forEach(System.out::println);
    }



}