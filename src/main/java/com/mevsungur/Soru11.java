package com.mevsungur;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mevlut.sungur
 */
public class Soru11 {
    public static void main(String[] args) {
        Ebook ebook = new Ebook();
        List<Readable> readableList = new ArrayList<>();
        readableList.add(new Book() {
            @Override
            public void setBookMark() {

            }
        });
        Book book = new Book() {
            @Override
            public void setBookMark() {

            }
        };

        readableList.add(ebook);

        System.out.println(ebook instanceof Readable);
        System.out.println(ebook instanceof Book);
        System.out.println(book instanceof Readable);

        ebook.readBook();
        book.readBook();

        Book book1 = new Ebook();
        book1.readBook();

    }


}

interface Readable {
    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable {
    public void readBook() {
        System.out.println("bu normal booktan geliyor.");
    }
}

class Ebook extends Book {




    @Override
    public void setBookMark() {

    }
}
