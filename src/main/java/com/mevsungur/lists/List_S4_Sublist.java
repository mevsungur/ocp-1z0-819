package com.mevsungur.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Sublist verilen listenin bir görüntüsünü döner.
 * Dolayısı ile sublistte yapılan değişiklikler gerçek
 * listeyi etkiler.
 */
public class List_S4_Sublist {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("P");
        list.add("O");
        list.add("T");

        List<String> subList = list.subList(1, 2); //Line n1
        subList.set(0, "E"); //Line n2
        System.out.println(String.join("", list));
    }
}
