package com.mevsungur.package2;



import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * Functional interface ????
 * mevlut.sungur
 * 26.03.2021
 */
public class Test2 {

    public static void main(String[] args) throws IOException {


        List<Employee> employees = Arrays.asList(new Employee("Jack", 10000),
                new Employee("Lucy", 12000));
        employees.stream()
                .peek(e -> e.setSalary(e.getSalary() + 1000))
                .forEach(System.out::println);

        byte b1 = (byte) (127 + 21);



        List<Integer> list = Arrays.asList(0,2,4,6,8);
        listChange(list);
        StringBuilder sb = new StringBuilder("INHALE ");
        String s = sb.toString() + (sb.append("EXHALE "));
        System.out.println(s.strip().length());

        List<String> list3 = Arrays.asList("M", "R", "A", "P");
        Collections.sort(list3, null);

        System.out.println(list);

        System.out.println(s = "333");

        boolean flag = false;
        do {
            if(flag = !flag) { //Line n1
                System.out.print(1); //Line n2
                continue; //Line n3
            }
            System.out.print(2); //Line n4
        } while(flag); //Line n5

    }


    public static void listChange(List<Integer> lll) {
        lll = new ArrayList<>();
        lll = Arrays.asList(0,2,4,6,8);
        lll.replaceAll(i -> i + 1);
    }


}

class MyResource implements AutoCloseable {
    @Override
    public void close() throws IOException {
        throw new IOException("IOException");
    }

    public void execute() throws SQLException {
        throw new SQLException("SQLException");
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "{" + name + ", " + salary + "}";
    }
}


interface Creator<T, R> {
    R create(T t);
}

interface D1<T> {
    T create();
}

class Log {


    Log() {
        System.out.println(1);
    }

    Log(String name) {
        System.out.println(2);
    }

    public static void main(String[] args) {
        System.out.println(Beden.MEDIUM);
        System.out.println(Beden.LARGE.ordinal());
    }

}
