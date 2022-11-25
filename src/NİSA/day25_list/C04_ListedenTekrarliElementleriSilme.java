package NİSA.day25_list;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarliElementleriSilme {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayıyaları
        // sadece bir kere yazdıran bir method oluşturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]
        //output [1, 3, 5, 6, 7]

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsizListeOluştur(sayilar);




    }

    public static void tekrarsizListeOluştur(List<Integer> sayilar) {

        List<Integer> tekrarsizList = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsizList.contains(sayilar.get(i))){
                tekrarsizList.add(sayilar.get(i));

            }

        }
        System.out.println(tekrarsizList); // [1, 3, 5, 6, 7]


    }
}
