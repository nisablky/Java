package NİSA.day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // verilen bir array'in tekrar eden elementlerini
        // sadece bir kere yazdıran bir method oluşturun

        Integer arr[] = {3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTekrarasizYazdir(arr);
    }

    private static void arrayiTekrarasizYazdir(Integer[] arr) {
        Set<Integer> tekrarsizElementKumesi= new HashSet<>();
        for (Integer each:arr
             ) {
            tekrarsizElementKumesi.add(each);
        }

        System.out.println(tekrarsizElementKumesi); //[1, 2, 3, 4, 5, 6, 7, 8]

    }
}
