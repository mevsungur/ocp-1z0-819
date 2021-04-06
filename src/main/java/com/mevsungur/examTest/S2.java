package com.mevsungur.examTest;

/**
 * mevlut.sungur
 * 31.03.2021
 */
public class S2 {

}

interface Habitat {
    abstract void inhabit();
}

interface Forest extends Habitat{
    default void inhabit() {}
}

interface Town extends Habitat {
    default void inhabit() {}
}
// Yalnızca birini implement ederse compile hatası oluşmuyor ???
class Fox implements Forest {


}