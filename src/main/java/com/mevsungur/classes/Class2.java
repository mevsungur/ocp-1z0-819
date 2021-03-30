package com.mevsungur.classes;

 class Greet {
    public  void sayHello() {
        System.out.println("Hello!");
    }
}

public class Class2  {
    public static void main(String[] args) {
        Greet obj = new Greet() {
            public void SayHello() {
                System.out.println("HELLO!");
            }
        };
        obj.sayHello();
        long l = 100;
        Long l2 = 100L;
    }
}