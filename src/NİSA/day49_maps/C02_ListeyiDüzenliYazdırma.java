package NİSA.day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDüzenliYazdırma {
    public static void main(String[] args) {
        //Sinif listesini duzenli bir şekilde yazdırmak

        Map<Integer,String > sinif =  MapOluştur.myMap();
        System.out.println(sinif);
        sinifListYazdir(sinif);

    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {

        System.out.println("Numara  Isim  Soyisim  Brans");
        System.out.println("============================");

        // Map yapısından yazdırdığımızda kullanıcılar bir şey anlamayabilir
        // bunun için önce map yapısını kodlara manipule edip
        // map'deki datalari, istediğimiz formata sokmamız gerekir
        // 1. adım key ve value'lari map'den alip
        // iki farkli collection uyesine atadık
        Set<Integer> keySet= sinif.keySet();
        Collection<String> valueSet= sinif.values();

        System.out.println(keySet); //[101, 102, 103]
        System.out.println(valueSet); //[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
        System.out.println(valueSet.size()); //3

        for (String each : valueSet
                ) {
            System.out.println(each); //Ali, Can, Dev
                                     // Veli, Yan, QA
                                    // Ali, Yan, C#
        }


       


    }
}
