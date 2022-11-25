package NİSA.day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste);//[5, 7, 8, 6, 9]


        Iterator itr = liste.iterator();// iterator methodunu oluşturduğumuz liste objesi
                                        // üzerinden ArrayList class'ından çalıştırıyoruz

        /*
        iterator nasıl çalışır
        bir iterator objesi oluşturmak için collection üyesi bir obje kullanmalıyız
         Iterator itr = liste.iterator();
        yani biz bu iterator objesini bizim örneğimizde liste objesi üzerinde
        çalışmak için oluşturmuş olduk
        Biz iterator objesini oluşturduğumuzda,
        iterator collection'in ilk elementinin öncesine gidip bekler

        [ (itr)5, 7, 8, 6, 9]

        itr.hasNext(); ===> true  iterator'a yanında eleman var mı diye sorar, true veya false döndürür

        itr.next();  ===>  iterator bir sonraki elementin yanına geçer,
                          ve üzerinden geçtiği elementi bize döndürür

        [ 5, (itr)7, 8, 6, 9] ===> bize 5 döndürür

        itr.next();  ===>

        [ 5, 7, (itr)8, 6, 9] ===> bize 7 döndürür

        itr.remove();  ===> iterator'ın elinde olan elementi sildi
        dolayısıyla üst üste iki kere itr.remove();  KULLANILAMAZ

        önce itr.next(); methodunu çalıştırıp
        iterator'in bir element olmasını sağlamalyız
         */

        System.out.println(itr.hasNext());//true

        System.out.println(itr.next());//5
        System.out.println(itr.next());//7
        itr.remove();//
        System.out.println(liste);//[5, 8, 6, 9]
       // itr.remove();

    }
}
