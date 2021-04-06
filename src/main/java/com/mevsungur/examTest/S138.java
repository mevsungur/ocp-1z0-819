package com.mevsungur.examTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * mevlut.sungur
 * 2.04.2021
 */
public class S138 {
}

class Foo138 {
    public List<Number> foo(Set<CharSequence> m) {
        return null;
    }
}

class Bar138 extends Foo138{

    //public List<Integer> foo(Set<CharSequence> m) { return null; }

    //public ArrayList<Number> foo(Set<CharSequence> m) { return null; }

    //public List<Integer> foo(TreeSet<String> m) { return null; }


    //Hata oluşuyor
    // public List<Integer> foo(Set<String> m){ return null; }
}
