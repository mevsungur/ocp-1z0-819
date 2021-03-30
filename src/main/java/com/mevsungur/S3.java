package com.mevsungur;

import java.util.Optional;

public class S3 {

    public static void main(String[] args) {
        var optional = Optional.ofNullable(System.console());
        if(optional.isPresent()) {
            System.out.println(optional.get());
        }
    }
}
