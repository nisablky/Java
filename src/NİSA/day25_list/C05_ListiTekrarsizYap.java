package NİSA.day25_list;

import java.util.ArrayList;
import java.util.List;

public class C05_ListiTekrarsizYap {
    public static void main(String[] args) {

        // verilen bir listede tekrar eden sayıyaları
        // sadece bir tane yapan bir method oluşturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7] bu listi
        //output [1, 3, 5, 6, 7] bu hale dönüştürün

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        sayilar= tekrarsızListeOluştur(sayilar);
        System.out.println(sayilar);

    }

    public static List<Integer> tekrarsızListeOluştur(List<Integer> sayilar) {
        List<Integer> tekrarsızList = new ArrayList<>();
        for (int i = 0; i <sayilar.size() ; i++) {

            if (!tekrarsızList.contains(sayilar.get(i))){
                tekrarsızList.add(sayilar.get(i));

            }

        }
        return tekrarsızList;



    }
}
