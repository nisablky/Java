package NİSA.day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> myMap = new HashMap<>();
        myMap.put("H",3);
        myMap.putIfAbsent("K",5);


        // bir ekleme yapmak istediğimiz de key daha önce eklenmemişse map'e eklesin
        // daha önceden eklenmişse, eskiyi silmemek için bizi uyarsın

        System.out.println(myMap.putIfAbsent("A", 6));

        if (myMap.putIfAbsent("K",20) != null){
            System.out.println("Girdiğiniz Key Map'de zaten var");
        }
        System.out.println(myMap);

        myMap.put("A",10);

        System.out.println(myMap);

        myMap.computeIfAbsent("A", v->20);

        System.out.println(myMap);

        myMap.compute("A" , (key,value) -> 20);
        System.out.println(myMap);

        // H'nin değerini 2 katının 5 fazlası yapalım

        myMap.compute("H", (k,v) -> (2*v+5));
        System.out.println(myMap);




    }
}
