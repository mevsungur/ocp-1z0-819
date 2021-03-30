package com.mevsungur;
//Line n1
class Util {
    /**
     * @deprecated This method has been deprecated,
     * use add(int...) method instead
     */
    @Deprecated(since = "10")
    //Line n2
    public static int add (int n1, int n2) {
        return n1 + n2;
    }

    public static int add(int... nums) {
        var sum = 0;
        for(int i : nums)
            sum += i;
        return sum;
    }
}

//Line n3
@SuppressWarnings({"deprecated"}) // deprecation yazınca oluyor yalnızca.
public class S4_Deprecated {
    //Line n4
    //@SuppressWarnings({"deprecation"})
    public static void main(String[] args) {
        System.out.println(Util.add(10));
        System.out.println(Util.add(10, 20));
        System.out.println(Util.add(10, 20, 30));
    }
}
