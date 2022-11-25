package NİSA.day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        //iki String array oluşturunuz
        // ve bu array'lerdeki otak elemanları For-each loop kullanarak buulunuz.
        // sonucu ekrana yazdırınız.
        // ortak eleman yoksa ekrana "ortak eleman yok " yazdırınız.

        String array1[]={"Ali","Ayşe","Can","Fatma" };
        String array2[]={"Can","Evren","Emsal","Fatma","Emre"};

        List<String> ortakElemanlar= new ArrayList<>();

        for (String each1:array1
             ) {
            for (String each2: array2
                 ) {
                if (each1.equals(each2)){
                    ortakElemanlar.add(each1);

                }

            }
        }

        if (ortakElemanlar.isEmpty()){
            System.out.println("Ortak eleman yok");
        }else{
            System.out.println("Ikı array' deki ortak elemanlar : " +  ortakElemanlar);
        }


    }
}
