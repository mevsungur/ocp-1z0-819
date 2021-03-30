package com.mevsungur.interfaces;

public class Interface2 {

    interface I1 {
        void m1();

        interface I2 {
            void m2();
        }

        abstract class A1 {
            public abstract void m3();
        }

        class A2 {
            public void m4() {
                System.out.println(4);
            }

            interface I3 {
                interface I4 {
                    interface I5 {
                        static class C1 {

                        }
                    }
                }
            }
        }
    }
}


