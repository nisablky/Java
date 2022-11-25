package NİSA.day25_list;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {
        // verilen bir array i listeye cevirin

        String arr[]={"A", "B", "C"};
        List<String> arraydenList =Arrays.asList(arr);


        // arrayden liste cevirdiğimiz zaman listin uzunluğunu değiştirremeyiz
        // dolayısıyla yeni list ile add() , Remove() , clear() gibi methodlar çalıştırmak
        //  istedğimizde Exception oluşur
        // arraydenList.add("J"); //UnsupportedOperationException
        System.out.println("19.satırda list : " + arraydenList);
        arr[1]="F";



        System.out.println("23.satırda Array : " + Arrays.toString(arr));
        System.out.println("24.satırda List : " + arraydenList);

        arraydenList.set(0,"Y");

        System.out.println("28.satırda Array : " + Arrays.toString(arr));
        System.out.println("29.satırda List : " + arraydenList);





    }
}
