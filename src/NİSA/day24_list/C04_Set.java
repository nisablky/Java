package NİSA.day24_list;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");//[Aykut, Yusuf, Ilker, Oguzhan]
        System.out.println(isimler);

        isimler.set(1,"Seckin"); // yusuf gitti seçkin geldi



    }
}
