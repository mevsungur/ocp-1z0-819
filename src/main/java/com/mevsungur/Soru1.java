package com.mevsungur;

class Product {
    double price;
}
public class Soru1 {
    public void updatePrice(Product product, double price) {
        price=price*2;
        product.price= product.price + price;
    }

    public static void main(String[] args) {
        Product prt = new Product();
        prt.price=200;
        double newPrice = 100;

        Soru1 soru1 = new Soru1();
        soru1.updatePrice(prt,newPrice);
        System.out.println(prt.price + " " + newPrice);
    }
}
