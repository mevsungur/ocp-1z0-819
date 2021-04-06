package com.mevsungur.paths;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * mevlut.sungur
 * 29.03.2021
 */
public class Path_Normalize {

    public static void main(String[] args) {
        var path = Paths.get(".", "..", ".", "..", "..", ".").normalize();
        var path2 = Paths.get(".", "..", ".", "..", "mev", "..", ".").normalize();
        System.out.println(path.getNameCount());
        System.out.println(path.getName(0).toString().length());
        System.out.println(path);
        System.out.println(path2);
        System.out.println(path2.getNameCount());
        System.out.println(path2.getName(0).toString().length());

        int[] arr1 = {10, 100, 1000}; //Line n1
        char[] arr2 = {'x', 'y', 'z'}; //Line n2
       // arr1 = arr2; // Line n3
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " "); //Line n4
        }
    }

}

class Tesssst {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<Integer> list = create();
    }

    /*INSERT-2*/
    private static List create() {
        return new ArrayList();
    }
}
