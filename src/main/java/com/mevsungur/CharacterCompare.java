package com.mevsungur;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.*;

/**
 * mevlut.sungur
 * 29.03.2021
 */
public class CharacterCompare {

    public static void main(String[] args) {
        char [] arr1 = {'A'};
        char [] arr2 = {'A', 'A', 'A', 'A'};
        System.out.println(Arrays.compare(arr1, arr2));

        System.out.println(new Character('A').compareTo(new Character('Z')));


        var map = new LinkedHashMap<Integer, String>();
        map.put(1,  null);
        map.put(2,  "TWO");
        map.put(3, "THREE");
        map.merge(1, "ONE", String::concat); //Line n1
        map.merge(2, "2", (s1, s2) -> s2 + ":" + s1); //Line n2
        map.merge(3, "3", (s1, s2) -> null); //Line n3
        System.out.println(map);



    }
}

/**
 For Character, Byte & Short; compare method returns x - y.

 For Integer and Long; compare method returns -1 if x < y, it returns 1 if x > y and it returns 0 if x == y.
 */