package com.mevsungur.examTest;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * mevlut.sungur
 * 5.04.2021
 */
public class S131 {

    public static void main(String[] args) {

        try(Reader reader1 = new FileReader("File1.txt");
        Reader reader2 = new FileReader("File2.txt");
        Reader reader3 = new FileReader("File3.txt")) {

        } catch (IOException e) {
            Logger.getLogger(S131.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}
