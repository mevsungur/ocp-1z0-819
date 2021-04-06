package com.mevsungur.classes;

/**
 * mevlut.sungur
 * 30.03.2021
 */
public class InnerClassPrivate {
    public static void main(String[] args) {
        new X().invokeInner();
    }
}
class X {
    class Y {
        private void m() {
            System.out.println("Outer Accessed Inner");
            OuterClassPrivateMethod();
        }
    }

    public void invokeInner() {
        var obj = new Y(); //Line n1
        obj.m(); //Line n2
    }

    private void OuterClassPrivateMethod() {
        System.out.println("Inner Accessed Outer");
    }
}
