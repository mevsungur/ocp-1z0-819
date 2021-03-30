package com.mevsungur.abstracts;

import java.io.IOException;

public abstract class Abstract2 {

    abstract protected   void privateMethod();

    abstract void defaultMethod();
}

class Child extends Abstract2 {

    @Override
    public void privateMethod() {

    }

    @Override
    protected void defaultMethod() {

    }
}

class Parent {
    Parent() throws IOException {
        System.out.print("HAKUNA");
    }
}

class Child2 extends Parent {
    Child2() throws Exception {
        System.out.println("MATATA");
    }
}

interface Int1 {}

interface Int2 extends Int1 {}

//interface Int3 implements Int2 {}