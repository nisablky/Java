package NİSA.day51_maps;

import NİSA.day49_maps.MapOluştur;

import java.util.*;

public class C02_IstenenElementleriListele {
    public static void main(String[] args) {

        /*
         Verilen map'te istenen programlama dilini bilen kişileri
         list olarak döndüren bir method yazınız.
         map => { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C# }
         istenen dil => java
         sonuç => [Ali, Veli]

         */

        Map<Integer,String> sinifMap = MapOluştur.myMap();
        String istenenDil = "Dev";
        List<String> istenenDiliBilenlerListesi = istenenDiliBilenListesiOluştur(sinifMap,istenenDil);
        System.out.println(istenenDiliBilenlerListesi);
    }

    public static List<String> istenenDiliBilenListesiOluştur(Map<Integer, String> sinifMap, String istenenDil) {

        List<String> istenenDiliBilenlerListesi = new ArrayList<>();
        Collection<String> sinifValueColl = sinifMap.values();
        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
        int  outerArrayBoyut= sinifValueList.size();
        String ilkValue = sinifValueList.get(0);
        String ilkValueArray[] = ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;
        String valueMDArr[][] =  new String[outerArrayBoyut][innerArrayBoyut];


        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[] =  sinifValueList.get(i).split(", ");
            for (int j = 0; j <innerArrayBoyut ; j++) {

                valueMDArr[i][j] = temp[j];



            }
        }


        for (int i = 0; i <outerArrayBoyut ; i++) {


                if (valueMDArr[i][2].equals(istenenDil)){
                    istenenDiliBilenlerListesi.add(valueMDArr[i][0]);
                }

            }


        return istenenDiliBilenlerListesi;
    }
}
