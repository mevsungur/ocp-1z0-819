package com.mevsungur.examTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/**
 * mevlut.sungur
 * 6.04.2021
 */
public class S54 {

    public static void main(String[] args) {
        List<Employee_54> list = List.of(new Employee_54("John", 80000.0));
        double starts=0.0, ratio=1.0;
        BinaryOperator<Double> bo = (a,b) -> a+b;
        //double totalSalary = list.stream().map(Employee::getSalary * ratio).reduce (bo).orElse(0.0);
        double totalSalary = list.stream().mapToDouble(e-> e.getSalary() * ratio).sum();
        System.out.println(totalSalary);
    }

}

class Employee_54 {
    String name;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee_54(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}


