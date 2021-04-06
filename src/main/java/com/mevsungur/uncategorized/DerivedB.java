package com.mevsungur.uncategorized;

/**
 * @author mevlut.sungur
 */
public class DerivedB extends Base
{
    @Override
    public void test() {
        System.out.println("derived b");
    }

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        DerivedA b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3;
        b2=(DerivedA) b1;
        b1.test();
//        b4.test();
        String[] strings;
        int x;
        System.out.println("5+2 " + (3 + 4) );

    }


}
