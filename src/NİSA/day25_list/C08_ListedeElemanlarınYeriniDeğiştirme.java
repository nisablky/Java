package NİSA.day25_list;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarınYeriniDeğiştirme {
    public static void main(String[] args) {
        //verilen bir listede istenen iki indexde ki elementlerin yerini
        // kaılıcı olarak değiştiren bir method oluşturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);



        int ilkIndex=2;
        int ikinciIndex=5;

        sayilar= swapElements(sayilar,ilkIndex,ikinciIndex);
    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        //bir temp sayı oluşturup
        // verilen indexlerdeki sayıları yer değiştirin
        //indexleri kontrol edip sıınırın ötesinde index verildiyse uyarı mesajı yazdırın


        return sayilar;
    }
}
