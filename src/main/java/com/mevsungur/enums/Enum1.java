package com.mevsungur.enums;

/**
 * Enum bir interface'i implement edebilir.
 */
public enum  Enum1 implements Kisi  {
    KADIN, ERKEK, BILINMIYOR;

    @Override
    public void kos() {
        System.out.println("koş");
    }

    @Override
    public void yuru() {
        System.out.println("yürü");
    }

    public static void main(String[] args) {
        System.out.println("Enumun main sınıfı olabilir.");
    }
}

interface Kisi {
    void kos();
    void yuru();
}
