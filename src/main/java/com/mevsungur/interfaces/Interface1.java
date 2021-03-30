package com.mevsungur.interfaces;

public class Interface1 extends I2 implements I1  {
    @Override
    public void method1() {

    }
}

interface I1 {
    void method1();
}

abstract class I2 {
    abstract void method1();
}
