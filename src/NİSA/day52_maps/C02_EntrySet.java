package NİSA.day52_maps;

import NİSA.day49_maps.MapOluştur;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap = MapOluştur.myMap();

        /*
        myMap.entrySet(); method'u bize Entry'lerden oluşan bir set döndürür
        Eğer bu Entr'leri manipule etmek istiyorsak
        method'un döndürdüğü Set'i yeni bir Set oluşturup store etmeliyiz
         */


        Set<Map.Entry<Integer,String>> sinifEntrySeti = sinifListMap.entrySet();

        System.out.println("No   Isim  Soyisim   Brans  D.Yili");
        System.out.println("----------------------------------");

        for (Map.Entry<Integer,String> each: sinifEntrySeti
        ) {

            Integer entryKey = each.getKey();
            String valueStr = each.getValue();

            String valueArr[] = valueStr.split(", ");

            System.out.printf(  "%-4d %-6s %-9s %-6s %s\n" , entryKey, valueArr[0], valueArr[1]
                   , valueArr[2], valueArr[3]);


        }
        System.out.println("---------------------------------");
    }
    }
