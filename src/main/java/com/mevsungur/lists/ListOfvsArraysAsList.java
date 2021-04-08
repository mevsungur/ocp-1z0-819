package com.mevsungur.lists;

import java.util.Arrays;
import java.util.List;

public class ListOfvsArraysAsList {

    public static void main(String[] args) {


        listOfImmutableArraysAsListMutableListDoner(new String[]{"Mevlüt", "Sungur"});

        listOfNullElemanKabulEtmez(new String[]{"Mevlüt", "Sungur",null});

        listOfContainsMethodunaNullReferansVerilirseHataFirlatilir(new String[]{"Mevlüt", "Sungur"});

        arraysAsListMethoduArraydeSonradanYapilanDegisikliktenEtkilenirListOfEtkilenmez(new String[]{"Mevlüt", "Sungur"});

        listOfveArraysAsListMethodlarininHerIkisindeDeSonradanAddMetoduCagrilamaz(new String[]{"Mevlüt", "Sungur"});


    }

    /**
     * List of metodu immutable bir list örneği dönerken, arrays asList methodu mutable
     * list objesi döner. Dolayısı ile list.of metodu ile oluşturulan listede sonradan
     * öğe değişikliği yapılamaz.
     * @param stringArr
     * @return
     */
    private static void listOfImmutableArraysAsListMutableListDoner(String[] stringArr) {
        var list1 = Arrays.asList(stringArr); // Mutable
        var list2 = List.of(stringArr); // Immutable

        list1.set(1, "SUNGUR");
        System.out.println(list1);
        try {
            list2.set(2, "SUNGUR"); // Will throw exception (UnsporttedOperationException)
        } catch (Exception e) {
            System.out.println("Exception thrown." + e.getMessage());
        }

    }

    private static void listOfNullElemanKabulEtmez(String[] stringArr) {
        var list1 = Arrays.asList(stringArr); // Mutable


        System.out.println(list1);

        try {
            var list2 = List.of(stringArr); //Immutable
            System.out.println(list2);
        } catch (NullPointerException e) {
            System.err.println("NullPointerException thrown." + e.getMessage());
        }

    }

    private static void listOfContainsMethodunaNullReferansVerilirseHataFirlatilir(String[] stringArr) {
        var list1 = Arrays.asList(stringArr);
        var list2 = List.of(stringArr);


        System.out.println(list1.contains(null)); // Hata fırlatılmayacak false dönecektir.

        try {
            System.out.println(list2.contains(null));
        } catch (NullPointerException e) {
            System.err.println("NullPointerException thrown." + e.getMessage());
        }

    }

    private static void arraysAsListMethoduArraydeSonradanYapilanDegisikliktenEtkilenirListOfEtkilenmez(String[] stringArr) {
        var list1 = Arrays.asList(stringArr);
        var list2 = List.of(stringArr);

        System.out.println(list1 + "\t" + list2);

        stringArr[0]="Vemlüt";
        System.out.println(list1 + "\t" + list2);


    }

    private static void listOfveArraysAsListMethodlarininHerIkisindeDeSonradanAddMetoduCagrilamaz(String[] stringArr) {
        var list1 = Arrays.asList(stringArr);
        var list2 = List.of(stringArr);


        try {
            list1.add("Yeni eleman");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            list2.add("Yeni eleman");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }



    }
}

/**
 *
 * +----------------------+---------------+----------+----------------+---------------------+
 * |      Operations      | SINGLETONLIST | LIST::OF | ARRAYS::ASLIST | JAVA.UTIL.ARRAYLIST |
 * +----------------------+---------------+----------+----------------+---------------------+
 * |          add         |       ❌      |     ❌  |        ❌      |          ✔️          |
 * +----------------------+---------------+----------+----------------+---------------------+
 * |        addAll        |       ❌      |     ❌  |        ❌      |          ✔️          |
 * +----------------------+---------------+----------+----------------+---------------------+
 * |         clear        |       ❌      |     ❌  |        ❌      |          ✔️          |
 * +----------------------+---------------+----------+----------------+---------------------+
 * |        remove        |       ❌      |     ❌  |        ❌      |          ✔️          |
 * +----------------------+---------------+----------+----------------+---------------------+
 * |       removeAll      |       ❗️     |     ❌   |        ❗️       |          ✔️          |
 * +----------------------+---------------+----------+----------------+---------------------+
 * |       retainAll      |       ❗️     |     ❌  |        ❗️        |          ✔️          |
 * +----------------------+---------------+----------+----------------+---------------------+
 * |      replaceAll      |       ❌      |     ❌  |        ✔️       |          ✔️          |
 * +----------------------+---------------+----------+----------------+---------------------+
 * |          set         |       ❌      |     ❌  |        ✔️       |          ✔️          |
 * +----------------------+---------------+----------+----------------+---------------------+
 * |         sort         |       ✔️   |     ❌   |        ✔️      |          ✔️          |
 * +----------------------+---------------+----------+----------------+---------------------+
 * |  remove on iterator  |       ❌      |     ❌  |        ❌      |          ✔️          |
 * +----------------------+---------------+----------+----------------+---------------------+
 * | set on list-iterator |       ❌      |     ❌  |        ✔️       |          ✔️          |
 * +----------------------+---------------+----------+----------------+---------------------+
 */
