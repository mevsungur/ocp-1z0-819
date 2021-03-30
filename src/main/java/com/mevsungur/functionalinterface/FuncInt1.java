package com.mevsungur.functionalinterface;

/**
 * Kod başarılı bir şekilde derlenebiliyor.
 * Fakat create metodu çağrılmadan ekrana bir şey yazmaz.
 * @param <T>
 * @param <R>
 */
interface Creator<T, R> {
    R create(T t);
}

class Log {

    Log() {
        System.out.println(1);
    }

    Log(String name) {
        System.out.println(2);
    }

}

public class FuncInt1 {
    public static void main(String[] args) {
        Creator<String, Log> obj = Log::new;

        Creator<String, Log> obj2 = (str) -> new Log("2");

        System.out.println(obj.getClass());

    }
}