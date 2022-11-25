package NİSA.day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        LinkedList'in 2 tane parent Interface'i vardır
        LinkedList oluştururken data türü olarak
        LinkedList seçersek : iki parent'daki tüm methodlar
        List seçersek : sadece List Interface'indeki methodlar
        Deque/Queue seçersek : Deque'deki method'ları kullanabiliriz
         */

        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(10); // LinkedList



        // Sadece List inteface'ınden özellikler kullanmak istersek

        List<Integer> ll2 = new LinkedList<>();
        ll2.add(10);
        ll2.remove(0);



        // Sadece Deque den gelen özellikleri kullanalım
        Deque<Integer> ll3 = new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3); //[15, 20]
        ll3.addLast(40); //[15, 20, 40]
    }
}
