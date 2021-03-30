package com.mevsungur.lists;

import java.util.Arrays;
import java.util.List;

public class List_S2 {

    public static void main(String[] args) {
        String [] arr = {"EARTH", "MOON", "SUN", "PLUTO"};
        var list = Arrays.asList(args);
        var list2 = List.of(arr);
        list2.set(3,"JUPITER");
        list.set(3, "JUPITER"); //Line n1

        List<List<String>> allLists = Arrays.asList(list,list2);
        allLists.forEach(list1 -> System.out.println(list1)); //Line n2
    }
}


