package NİSA.day46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_IstenenElemanlarıSilme {
    public static void main(String[] args) {

        /*
        Bir listedeki istenen sayi aralığında olmayan
        elementleri silen bir program yazınız
        (2.liste oluşturmadan, geçerli liste üzerinde işlem yapınız)
        örn: [2,13,56,23,45,14,40] istenen aralık 20 ile 40 arası (sınırlar dahil)
        output: [23,40]
         */

        List<Integer> liste= new ArrayList<>();

        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        ListIterator itr = liste.listIterator();

        while (itr.hasNext()){

            Object sayi = itr.next();

            if ((Integer) sayi <20 || (Integer) sayi>40){
                itr.remove();
            }
        }

        System.out.println(liste);//[23, 40]
    }
}
