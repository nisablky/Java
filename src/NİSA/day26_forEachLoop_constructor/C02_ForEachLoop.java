package NİSA.day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        // 10 elementli bir list oluşturalım

        int arr[]={2,5,4,6,4,9,7,1,3,10};

        List<Integer> sayılar= new ArrayList<>();
        for (int each :arr
             ) {
            sayılar.add(each);
        }

        System.out.println(sayılar);//[2, 5, 4, 6, 4, 9, 7, 1, 3, 10]

        //sayılar listesinde 3'e bölünemeyen sayıları foor-each loop ile yazdıralım


        for (int each:sayılar
             ) {
            if (each %3 !=0){
                System.out.print(each + " ");//2 5 4 4 7 1 10
            }

        }
    }
}
