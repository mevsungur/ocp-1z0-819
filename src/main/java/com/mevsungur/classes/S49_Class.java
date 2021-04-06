package com.mevsungur.classes;

import java.util.List;

class Rope {
    int length;
    String color;

    Rope(int length, String color) {
        this.length = length;
        this.color = color;
    }


    public String toString() {
        return "Rope [" + color + ", " + length + "]";
    }

    static class RedRopeFilter {
        boolean filter(Rope rope) {
            return rope.color.equalsIgnoreCase("Red");
        }
    }
}

public class S49_Class {
    public static void main(String[] args) {
        var list = List.of(new Rope(5, "red"),
                new Rope(10, "Red"), new Rope(7, "RED"),
                new Rope(10, "green"), new Rope(7, "Blue"));

        list.stream().filter(new Rope.RedRopeFilter()::filter).forEach(System.out::println); //Line n1
    }
}
