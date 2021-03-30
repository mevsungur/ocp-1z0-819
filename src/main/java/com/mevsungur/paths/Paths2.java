package com.mevsungur.paths;

import java.nio.file.Paths;

/**
 * İki path'in kökü aynı tür olmadığı için
 * IllegalArgumentException alınacaktır.
 */
public class Paths2  {

    public static void main(String[] args) {
        var path1 = Paths.get("C:\\A\\B\\C");
        var path2 = Paths.get("D:\\A");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
    }
}
