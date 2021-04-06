package com.mevsungur.examTest;

import com.mevsungur.examTest.diffpackage.AuthorInfo;

/**
 * mevlut.sungur
 * 6.04.2021
 */
public class S24 {
}

//@AuthorInfo()
class HelloA {

}

class HelloB {
    @AuthorInfo(date = "1-1-2020", comments = "Hello")
    public void func() {

    }
}

class HelloC {
    //@AuthorInfo
    public void func() {}
}