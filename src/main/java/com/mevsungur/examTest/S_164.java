package com.mevsungur.examTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * mevlut.sungur
 * 1.04.2021
 */
public class S_164 {

    public static void main(String[] args) {
        try {
            Path path = Paths.get("/u01/work/filestore.txt");
            boolean result = Files.deleteIfExists(path);
            if(result) System.out.println(path + "is deleted");
            else System.out.println(path + " is not deleted");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
