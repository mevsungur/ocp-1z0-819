package com.mevsungur.lists;

import java.util.*;

/**
 * ThreeSet null value içeremez.
 * mevlut.sungur
 * 29.03.2021
 */
public class TreeSet1 {

    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(null,null,null));
        Set<String> hashSet = new HashSet<>(Arrays.asList(null,null,null));
        Set<String> set = new TreeSet<>(Arrays.asList(null,null,null));

        long count = set.stream().count();
        System.out.println(count);

        Deque<Character> chars = new ArrayDeque<>();

        chars.add('A');
    }
}

class Iterate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("T", "S", "R", "I", "F");
        ListIterator<String> iter = list.listIterator(5);
        while(iter.hasPrevious()) {
            System.out.print(iter.previous());
        }
    }
}

class TestClass {
    static Character obj;
    char c = obj.charValue();

    public static void main(String[] args) {
        System.out.println("DREAMS COME TRUE");
        System.out.println(new TestClass().c);
    }


}
