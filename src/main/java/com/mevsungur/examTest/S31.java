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
    }
}

class S31_B extends S31_A {
    int x = 17;

    public S31_B() {
        super();
    }
}