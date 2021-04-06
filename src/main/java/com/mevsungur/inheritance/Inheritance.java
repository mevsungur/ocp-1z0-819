package com.mevsungur.inheritance;

/**
 * Üst sınıf alt sınıfa cast edilemez.
 * Alt sınıf, üstü sınıfın aynı methodunu overrride edebilir. Eğer üst sınıf metodu final yapmışssa override edemezsin!
 *
 */
class A {
    public void print() {
        System.out.println("main.A");
    }

}


class B extends A {
    public void print() {
        System.out.println("main.B");
    }
}



public class Inheritance {
    public static void main(String[] args) {
        A obj1 =  new A();
        B obj2 = new B();
        obj2.print();
        obj1.print();
        System.out.println(obj1 instanceof A);
        System.out.println(obj1 instanceof B);
        System.out.println(obj2 instanceof A);
        System.out.println(obj2 instanceof B);
    }
}
