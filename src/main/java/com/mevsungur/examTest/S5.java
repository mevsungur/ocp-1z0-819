package com.mevsungur.examTest;

/**
 * mevlut.sungur
 * 31.03.2021
 */
public class S5 {
}

interface ExampleInterface {

    //A
    public abstract void methodB();

    //B - Compile Error
    //final void method() { System.out.println(); }

    //C
    //private abstract void methodC();

    //D
    public String methodD();

    //E - İlk değer atanmak zorunda.
    public int x=1;

    //F
    //final void methodE();

    //G
    // public void methodF(){System.out.println("F");}


}
