package com.mevsungur;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Hiçbir case ile eşleşmediğinde default ifadesine girer ve altında break gelene kadar tüm kodları işler.
 Case ile eşleşen durum olduğunda default'un hangi konumda olduğuna bakmaz ve GİRMEZ.
 switch içine BOOLEAN değişken yazılamaz. Enum yazılabilir. LONG yazılamaz.
 Char-byte-short-int-String veya Enum alır içine sadece.
*/
public class SwitchCase {
    public static void main(String[] args) {
        String fruit = "mango";
        boolean bo = false;
        Long l = new Long(200);;
        switch (fruit) {

            case "ff":
                System.out.println("APPLE");
            default:
                System.out.println("ANY FRUIT WILL DO");


        }



                int [] arr = {2, 1, 0};
                for(int i : arr) {
                    System.out.println(arr[i]);
                }


    }
    static {
        System.out.println("staticcccccccccccccccccc");
    }
}


//public class Test {
//    public static void main(String[] args) {
//        String fruit = "mango";
//        switch (fruit) {
//            default:
//                System.out.println("ANY FRUIT WILL DO");
//            case "Apple":
//                System.out.println("APPLE");
//            case "Mango":
//                System.out.println("MANGO");
//            case "Banana":
//                System.out.println("BANANA");
//                break;
//        }
//    }
//}




