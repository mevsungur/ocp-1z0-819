package com.mevsungur;

/**
 * Çağrılan metod exception fırlatıyor ise try catch bloğuna alınmak zorunda ya da throws yazılmalıdır. RunTimeException için bu geçerli değildir.
 * Aynı anda 2 adet main methodu olabilir. Exception yaratmaz. Fakat ikisi de String[] alamaz içine.
 * String variable'lar için derleyici initialize edildiğini compile anında emin olmak zorunda. Yoksa compileError!
 */


public class Main_Method {
    public static void main(String[] args) {
        main(); //Line 3

        double price = 90000;
        String model;
//        XCD xcd;
        if(price > 100000) {
            model = "Tesla Model X";
        } else if(price <= 100000) {
            model = "Tesla Model S";
        } else {
            model= "";
        }
        System.out.println(model);
//        System.out.println(xcd);
    }

    private static void main() throws ClassCastException { //Line 6
        System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
    }
}

//class XCD {
//    public String name="";
//
//}
