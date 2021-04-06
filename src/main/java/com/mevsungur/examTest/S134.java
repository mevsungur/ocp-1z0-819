package com.mevsungur.examTest;

import java.nio.DoubleBuffer;
import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * mevlut.sungur
 * 5.04.2021
 */
public class S134 {

    public static void main(String[] args) {
        testMethod();

        System.out.println(Double.parseDouble("22.00f"));

        System.out.println(Integer.valueOf("17") == 17);
    }

    private static void testMethod() {
        List<Employee> roster = Arrays.asList(new Employee("mevlüt", LocalDate.of(1959, 1, 1)),
                new Employee("mevlüt1992", LocalDate.of(1992, 1, 1)),
                new Employee("mevlüt1968", LocalDate.of(1968, 1, 1)),
                new Employee("mevlüt2001", LocalDate.of(2001, 1, 1))
        );

        Predicate<Employee> y = (Employee e) -> e.getBirtday().isBefore(IsoChronology.INSTANCE.date(1989, 1, 1));

        //A
        Set<String> s1 = roster.stream()
                .collect(Collectors.partitioningBy(y)).get(true).stream().map(Employee::getName)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(s1);

        //b -> Şıkta ikinci stream unutulmuş.
        Set<String> s2 = roster.stream()
                .collect(Collectors.partitioningBy(y)).get(true).stream().map(Employee::getName).collect(Collectors.toSet());

        System.out.println(s2);

        //C
//        Set<String> s3 = roster.stream()
//                .collect(Collectors.partitioningBy(y,Collectors.mapping(Employee::getName,Collectors.toSet())));

//        System.out.println(s3);

        //d
//        Set<String> s4 = roster.stream()
//                .collect(Collectors.partitioningBy(y,Collectors.groupingBy(Employee::getName,Collectors.toCollection(TreeSet::new))));
//
//        System.out.println(s3);


    }
}

class Employee {
    private String name;
    private LocalDate birtday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirtday() {
        return birtday;
    }

    public void setBirtday(LocalDate birtday) {
        this.birtday = birtday;
    }

    public Employee(String name, LocalDate birtday) {
        this.name = name;
        this.birtday = birtday;
    }
}
