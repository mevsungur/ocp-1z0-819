package com.mevsungur.abstracts;

/**
 * super veya this methodları bir constructorun ilk satırı olmak zorundadır.
 * Extend ettiğin classın default constructoru yoksa super'i çağırmak zorundasın.
 * Sysout methodu null gelen değeri ekrana null olarak yazar. Exception vermez.
 * Substring methodu başlangıç indexini alır, bitiş indexini almaz. Bitiş indeksi ekrana yazılmaz. Bitiş indeksi 'kadar' anlamı taşır.
 * Substring methoduna başlangıç ve bitiş aynı parametre verilebilir.
 * Sysout metoduna aritmetik işlem girildiğinde işlem sonucunu yazabilir.
 * Substring metoduna stringin uzunluğundan fazla değer girilirse java.lang.StringIndexOutOfBoundsException: exception fırlatılır.
 * Substring metoduna bitiş parametresi verilmezse son karaktere kadar yazacaktır.
 * Abstract class implement ettiği interface'in tüm metodlarını barındırmak zorunda değildir, ancak abstract class'tan inherit olanlar zorunludur!
 */


public class Abstract {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly", "Poodle");
        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
                dog2.getName() + ":" + dog2.getBreed());

        String str = "TR000620005000";

        System.out.println(str.substring(5));
        System.out.println(4+3);


    }
}

abstract class Animal2 {
    private String name;

    Animal2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal2 {
    private String breed;
    Dog(String breed) {
        super(breed);
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super(name);

    }

    public String getBreed() {
        return breed;
    }
}


//interface Printable {
//    public void setMargin();
//    public void setOrientation();
//}
//
//abstract class Paper implements Printable { //Line 7
//    public void setMargin() {}
//    //Line 9
//}
//
//class NewsPaper extends Paper { //Line 12
//    public void setMargin() {}
//    //Line 14
//}
