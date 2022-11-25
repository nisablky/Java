package NİSA.day52_maps;

import NİSA.day49_maps.MapOluştur;

import java.util.Map;
import java.util.Set;

public class C02_Update {
    public static void main(String[] args) {

        //Verilen map'deki numarası 102 olan kaydın bransını Java yapalım

        /*
        Map'de value kompleks olabildiği için
        value içerisinden bir bölümü değiştirmek istersek
        önce value' ya ulaşmak
        sonra onu manipule ederek istediğimiz değişikliği yapmak
        ve en son değişmiş halini yeniden Map'e eklemek gerekir
         */

        Map<Integer,String> sinifListMap = MapOluştur.myMap();
        System.out.println(sinifListMap);

        Set<Map.Entry<Integer,String>> sinifEntrySet =  sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each: sinifEntrySet
             ) {
            Integer keyEntry = each.getKey();

            if (keyEntry==102){
                String valueEntry = each.getValue();
                String valueArr[] = valueEntry.split(", ");
                valueArr[2]="Java";

                String valueYeni = valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2] + ", "
                        + valueArr[3];

                sinifListMap.put(keyEntry,valueYeni);

            }

        }
        System.out.println(sinifListMap);
    }
}
