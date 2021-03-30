package com.mevsungur.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Kapasite ile boyut farklı şeylerdir.
 * Kapasite 4 olmasına rağmen 0. indexe eleman eklendiğinde dizinin boyutu 1'dir.
 * Dolayısı ile 2. indexe eleman eklenmek istendiğinde IndexOutOfBoundsException
 * alınır.
 */
public class List_S1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);
        list.add(0, "MOVE");
        list.add(2, "ON");

        System.out.println(list);
    }
}
