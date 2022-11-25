package NİSA.day24_list;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");//[Aykut, Yusuf, Ilker, Oguzhan]
        System.out.println(isimler);


        // remove methodu istenen elementi kaldırıp bize true yada false doner
        // eğer değeri kontrol etmem için boolean bir değere attayıp if ile değerlendirme yapabilirsiniz.
        boolean sonuc = isimler.remove("Oguzhan");
        if (sonuc==true){
            System.out.println("istediğiniz isim silindi");
        }else System.out.println("istediğiniz isim silinmedi");

        System.out.println(isimler); //[Aykut, Yusuf, Ilker]

        //remove(index) yadığımıda sildim silmedim kalmaz
        // bize remove edilen elementi döner

        System.out.println(isimler.remove(1)); // yusuf isimini siler ve yusufu delil olarak gösteririr

        System.out.println(isimler);

    }
}
