package com.mevsungur.examTest;

/**
 * mevlut.sungur
 * 6.04.2021
 */
public class S29 {

    public static void main(String[] args) {
        char letter ='b';
        int i =0;

        switch (letter) {
            case 'a':
                i++;
                break;
            case 'b':
                i++;
            case 'c' | 'd':
                i++;
            case 'e':
                i++;
                break;
            case 'f':
                i++;
                break;
            default:
                System.out.println(letter);
        }

        System.out.println(i  );
    }
}
