package com.mevsungur.package2;

import com.mevsungur.Soru43;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author mevlut.sungur
 */
public class Test extends Soru43 {
    public static void main(String[] args) {


        Optional<String> stringOptional = Optional.of("null");

        System.out.println(stringOptional.or(() -> Optional.of("ORRR...")));

        System.out.println(stringOptional.isEmpty());

        Map<Object, Object> of = Map.of(); // Map.of boş olabilir.
        //Optional.of(); // Optional of boş olamaz.

        System.out.println(of);

        var map1 = Map.of("1", "2", "3", "4");

        System.out.println(map1);

        var map2 = Map.ofEntries(Map.entry("3", "4"), Map.entry("1", "2"));
        var list1 = List.of("1", "2", "3", "4");
        var list2 = List.of("4", "3", "2", "1");
        System.out.println(map1.equals(map2) + ":" + list1.equals(list2));

    }
}
