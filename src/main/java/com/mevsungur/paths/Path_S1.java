package com.mevsungur.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_S1 {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Windows");

        System.out.println(path);

        Path normalize = path.normalize();

        System.out.println(normalize);

        Path relativize = path.relativize(Paths.get("C:\\Users\\MS\\Downloads\\ma3api-java-2.2.17"));

        System.out.println(relativize);
    }
}
