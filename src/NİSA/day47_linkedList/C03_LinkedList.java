package NİSA.day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {

        Deque<Integer> ll1 = new LinkedList<>();

        System.out.println(ll1.peek()); //  boşken kullanırsak null döndürür
       // System.out.println(ll1.element()); // boşken kullanırsak exception fırlatıyor

        System.out.println(ll1.poll()); //  boşken kullanırsak null döndürür
        System.out.println(ll1.pollFirst());
        System.out.println(ll1.pollLast());

       // System.out.println(ll1.pop()); // ilk elementi silip, bize döndürür
                                       // ilk elementi bulamazsa exception fırlatır
        ll1.push(30); // listenin başına element ekler
        ll1.push(20);
        System.out.println(ll1); //[20, 30]

        System.out.println(ll1.remove()); // ilk elementi siler ve bize döndürür
        ll1.push(40);
        ll1.push(50);
        ll1.remove(50);  // object olarak 50'yi siler
        ll1.push(30);
        System.out.println(ll1); // [40, 30]
        ll1.removeLastOccurrence(30); //
        System.out.println(ll1);

        ll1.poll();
    }
}
