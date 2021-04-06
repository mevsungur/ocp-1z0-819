package com.mevsungur.uncategorized;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mevlut.sungur
 */
public class Soru53 {
}

class Vehicle {
    int x;

    Vehicle() {
        this(10);

    }

    Vehicle(int x) {
        this.x = x;
    }
}

class Car extends Vehicle {
    int y;

    Car() {
        super();
//        this(20);
    }

    Car(int y) {
        this.y=y;
    }
}

abstract class Animal {}

interface Hunter {}

class Cat extends Animal implements Hunter{}

class Tiger extends Cat {}

class Deneme {
    public static void main(String[] args) {
        int n [][] = {{1,3},{2,4}};
        for(int i = n.length-1;i>=0;i--) {
            for(int y : n[i]) {
                System.out.print(y);
            }
        }

        String stuff = "tv";
        String res =null;
        res = stuff.equals("TV") ? "Walter" : stuff.equals("Movie") ? "White" : "No result";
            List ps = new ArrayList();

        String[] names = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];

        int idx = 0;

        try {
            for(String n1:names) {
                pwd[idx] = n1.substring(2,6);
                idx++;
            }
        } catch (Exception e){
            System.out.println("exc");
        }

        for(String p: pwd) {
            System.out.println(p);
        }
    }
}
