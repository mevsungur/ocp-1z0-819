package com.mevsungur;

import java.util.Date;
//import java.sql.Date;

/**
 * İki paket de import edilirse derleyici hatasına neden olur.
 * Importlardan birisi sınıfın ismini içerirse derleyici hatası giderilmiş olur.
 *
 */
public class S2 {

    public static void main(String[] args) {

        Date date = new Date();
    }
}
