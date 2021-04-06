package com.mevsungur;

/**
 * mevlut.sungur
 * 28.01.2021
 */
class Message_2 {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class PassByReference {
    public static Message_2 change(Message_2 m) {
        m=new Message_2(); /** Yeni obje oluşturursan objede yaptığın değişiklik üst metoda gitmiyor. */
        m.msg = "Happy Holidays!";
        return m;
    }

    public static void main(String[] args) {
        Message_2 obj = new Message_2();
        obj.print();
        change(obj);
        obj.print();
    }
}
