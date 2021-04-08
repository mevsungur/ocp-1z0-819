package com.mevsungur.examTest;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Map;

/**
 * mevlut.sungur
 * 8.04.2021
 */
public class S58 {
    private LocalDate now = LocalDate.now();

    public LocalDate getNow() {
        return now;
    }
}

class X {
    private Collection collection;


    public void set(Collection collection) {
        this.collection = collection;
    }


}

class Y extends X {
    public void set(Map<String,String> map) {
//        super.set(map.values());
        set(map.values());
    }
}
