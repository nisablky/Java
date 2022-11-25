package NİSA.day25_list;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {

        // bir listede ortalmanın üstünde olan element sayısını bulunuz


        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        // ortalmayı bul
        double ortalama=0.0;
        double toplam=0.0;
        for (int i = 0; i < sayilar.size(); i++) {
            toplam+=sayilar.get(i);


        }
        ortalama=toplam / sayilar.size();
        System.out.println(ortalama);//3.875

        // ortalmanın üstünde olanları bir liste at

        List<Double> ortalamanınÜstündekiler = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i)>ortalama){
                ortalamanınÜstündekiler.add(sayilar.get(i));
            }

        }
        System.out.println(ortalamanınÜstündekiler);//[5.0, 5.0, 6.0, 7.0]

    }
}
