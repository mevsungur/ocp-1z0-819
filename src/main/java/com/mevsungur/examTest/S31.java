package com.mevsungur.examTest;

import com.mevsungur.examTest.diffpackage.S31_A;

/**!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * mevlut.sungur
 * 6.04.2021
 */
public class S31 {

    public static void main(String[] args) {
        S31_A obj = new S31_B();
        System.out.println(obj.x);
        System.out.println(((S31_B) obj).x);
        obj.m1();

        S31_B variable = null;
        S31_B.stMeth();



        variable.m1();
    }
}

class S31_B extends S31_A {
    int x = 17;

    public static void stMeth() {
        System.out.println("...");
    }

    public S31_B() {
        super();
    }

    public void m1() {
        System.out.println("B");
    }
}