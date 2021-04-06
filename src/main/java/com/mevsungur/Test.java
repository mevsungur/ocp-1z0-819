package com.mevsungur;


class Student {
    String name;
    int age;

    Student() {
        this("James", 25);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}
