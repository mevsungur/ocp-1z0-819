package com.mevsungur;

/**
 * Abstract method body içeremez.
 * Protected başka paketlerden erişemez.
 * Defaultta alt paketler erişemez.
 * Private'de yalnızca aynı class erişebilir, aynı paket de erişeemez.
 * private -> default -> protected -> public
 * Protected diğer paketlerden erişimi kısııtlar.
 * Abstract class'ı extend edenlerin metodları abstracttan daha açık erişim belirleyiciye sahip olabilir ama daha kapalı olamaz.
 */
public class Soru6 {
}


abstract class Planet {
    protected void revolve() {}

    abstract void rotate();
}

class Earth extends Planet {
    public void revolve() {

    }

    protected void rotate() {

    }
}
