package com.mevsungur.examTest;

/**
 * mevlut.sungur
 * 6.04.2021
 */
public class S80 {
    private int sum;

    public int compute() {
        int x=0;
        while(x<3) {
            sum +=x++;
        }
        return sum;
    }

    public static void main(String[] args) {
        S80 s80 = new S80();
        int sum = s80.compute();
        sum=s80.compute();
        //s80.compute();
        System.out.println(sum);

       
    }
}
