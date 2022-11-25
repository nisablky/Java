package NİSA.day49_maps;

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01Maps {
    public static void main(String[] args) {

        // Java'da collection uyesi bir yapıda
        // data turu Object seçilirse, her data turunden deger ekleyebiliriz
        // ancak bu durumda surekli casting problemleri ile karşılaşabiliriz

        List<Object> list = new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list); //[Ergin, 15, 10.2]
        list.set(1, (Integer)(list.get(1)) +10);

        Map<Integer,String> sinifList = new HashMap<>();
        // bir sınıfta ögrenci no ve isim, soyisim, brans olarak map oluşturmak istiyoruz
        // key tek bir unique degerdir
        // ama value/deger birden fazla bilginin birleşiminden oluşabilir
        // bu durumda daha sonra istediğimiz bilgilere dogru şekilde ulaşabilmek için
        // tum elementler için value aynı biçimde oluşturulmalıdır
        //(veri sıralama ve sekilsel acıdan)

        sinifList.put(101,"Ali, Can, Dev");
        sinifList.put(102,"Veli, Yan, QA");
        sinifList.put(103,"Ali, Yan, C#");

        System.out.println(sinifList); //{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}

        System.out.println(sinifList.keySet()); //[101, 102, 103]

        System.out.println(sinifList.values()); //[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]






    }
}
