package com.mevsungur.examTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * mevlut.sungur
 * 1.04.2021
 */
public class S172 {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(List.of(new Person(44,"Tom"),new Person(40,"Aman"),new Person(40,"Peter")));
        personList.sort(Comparator.comparing((Person::getAge)).thenComparing(Person::getName).reversed());
        personList.forEach(p1 -> System.out.println(" " + p1.getName()));
    }
}

class Person {
    private int age;
    private String name;

    public Person(int age, String ad) {
        this.age = age;
        this.name = ad;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}


