package NİSA.day51_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHarfSayisiniBulma {
    public static void main(String[] args) {

        /*
        Verilen bir String'deki harfleri
        ve harflerin kaçar kez kullanıldığını return eden bir method yazınız
        Örnek : Input : Hellooo  output : H=1, e=1, l=2, o=3

         */

        String input="Hellooo";
        String harflerArr[] = input.split("");

        Map<String,Integer> kullanimSayilari = new HashMap<>();

        for (String each: harflerArr
             ) {
            if (kullanimSayilari.containsKey(each)){

                kullanimSayilari.put(each , kullanimSayilari.get(each) + 1);
            }else{
                kullanimSayilari.put(each, 1);
            }
        }

        System.out.println(kullanimSayilari);
    }
}
