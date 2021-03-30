package com.mevsungur.lists;

import java.util.List;

/**
 * Line n3 compile hatasına neden olur, çünkü
 * list1 list <object> içerir.
 */
public class List3 {

    public static void main(String[] args) {
        var list1 = List.of(); //Line n1
        var list2 = List.of("A"); //Line n2
        //list1 = list2; //Line n3
        System.out.println(list1.size()); //Line n4
    }

}
