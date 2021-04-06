package com.mevsungur.lists;

import java.util.HashSet;
import java.util.Set;

/**
 * mevlut.sungur
 * 29.03.2021
 */
class Student1 {
    private String name;
    private int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

//    public boolean equals(Object obj) {
//        if(obj instanceof Student1) {
//            Student1 stud = (Student1)obj;
//            return this.name.equals(stud.name) && this.age == stud.age;
//        }
//        return false;
//    }
}

public class HashSet1 {
    public static void main(String[] args) {
        Set<Student1> students = new HashSet<>();
        students.add(new Student1("James", 20));
        students.add(new Student1("James", 20));
        students.add(new Student1("James", 22));

        System.out.println(students.size());
    }
}
