package com.mevsungur.examTest;

/**
 * mevlut.sungur
 * 1.04.2021
 */
public class S173 {
}


interface TestInterface {
    default void samplingProbeProcedure() {
        probeProcedure();
        System.out.println("Collect sample");
        System.out.println("Leave asteroid");
        System.out.println("Dock with Main Craft");
    }
    default void explosionProbeProcedure() {
        probeProcedure();
        System.out.println("Explode");
    }

    private void probeProcedure() {

    }
     static void probeProcedureStatic() {

    }


}

class TestInterfaceImpl implements TestInterface {
    public static void main(String[] args) {
        TestInterface.probeProcedureStatic();
    }


}