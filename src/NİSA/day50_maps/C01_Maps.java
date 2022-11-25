package NİSA.day50_maps;

import NİSA.day49_maps.MapOluştur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        // sınıftaki öğremci listesini düzenli olarak yazdıralım

        Map<Integer,String> sinifListMap = MapOluştur.myMap();
        System.out.println(sinifListMap); //{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}


        /*
        eğer key'lere tek tek ulaşmak istersek
        index yapısına ihtiyacımız var
        ancak map index yapısını desteklemez
        bunun için key'leri önce bir set'e
        sonra da set'i tüm elementlerini bir list'e ekledik
         */

        Set<Integer> sinifKeySeti = sinifListMap.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sinifKeySeti);

        // şimdi de value'lari index ile ulaşabileceğimiz bir şekle sokalım

        Collection<String> sinifValueColl = sinifListMap.values();
        System.out.println(sinifValueColl);

        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);

        System.out.println(sinifValueList);


        /*
         her bir value birden fazla bilgiyi içeriyor
         onun için velue'leri multidimensional bir arry'e atmak mantıklı duruyor
         ancak MDA oluşturmak için boyutları bilmeye ihtiyacımız var

         */

        int  outerArrayBoyut= sinifValueList.size();
        System.out.println(outerArrayBoyut);

        // inner array'lerin boyutunu bulmak biraz daha kompleks olacak

        String ilkValue = sinifValueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[] = ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;

        String valueMDArr[][] =  new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[] =  sinifValueList.get(i).split(", ");
            for (int j = 0; j <innerArrayBoyut ; j++) {

                valueMDArr[i][j] = temp[j];



            }
        }
        // bu satıra kadar key'leri index ile ulaşabildiğimiz keyList'e atadım
        // value'leri valueMDArr'e atadım
        // şimdi bu key ve value'leri istediğim gibi manuple edebilirim


        System.out.println("Numara  Isim  Soyisim  Brans");
        System.out.println("============================");
        for (int i = 0; i <keyList.size() ; i++) {
            System.out.print( keyList.get(i) + "   ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j] + "   ");
            }
            System.out.println("");
        }


    }
}
