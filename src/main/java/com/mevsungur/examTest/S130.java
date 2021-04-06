package com.mevsungur.examTest;

import java.util.ArrayList;
import java.util.List;

/**
 * mevlut.sungur
 * 5.04.2021
 */
public class S130 {

    public static void main(String[] args) {
        List<String> longList = List.of("Hello", "World", "Beat", "Teab","ee","aro","sadcsde");
        ArrayList<String> shortList = new ArrayList<>();

        for(var i=0;i<5;i++) {

            longList.parallelStream().filter(w -> w.indexOf('e') !=-1).forEach(w -> shortList.add(w));
            System.out.println(shortList);
            shortList.clear();
        }

    }
}
