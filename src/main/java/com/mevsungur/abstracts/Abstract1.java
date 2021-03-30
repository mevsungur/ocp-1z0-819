package com.mevsungur.abstracts;

abstract class Animal {
    abstract void jump() throws RuntimeException;
}

class Deer extends Animal {
    void jump() { //Line n1
        System.out.println("DEER JUMPS");
    }

    void jump(int i) {
        System.out.println("DEER JUMPS TO " + i + " FEET");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        Animal animal = new Deer();
        ((Deer)animal).jump(); //Line n2
        ((Deer)animal).jump(5); //Line n3
    }
}