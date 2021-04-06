package com.mevsungur;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Message {
    static void main(String [] args) {
        System.out.println("Welcome! " + args[1]);
    }
}

public class Guest {
    public static void main(String [] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

//        Iterator<String> iterator = dryFruits.iterator();
//        while(iterator.hasNext()) {
//            String dryFruit = iterator.next();
//            if(dryFruit.startsWith("A")) {
////                dryFruits.remove(dryFruit);
//                iterator.
//            }
//        }
//

        System.out.println(dryFruits);

        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getSecond());
    }
}
