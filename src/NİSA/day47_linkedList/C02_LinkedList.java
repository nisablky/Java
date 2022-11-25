package NİSA.day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        //List'den gelen özellileri biliyoruz
        // onun için Deque'den gelen özelliklere bakalım

        Deque<Integer> ll1 = new LinkedList<>();
        ll1.addFirst(10); // başa element ekler
        ll1.addLast(20); // sona element ekler add() göre daha hızlıdır
        System.out.println(ll1); //[10, 20]
        System.out.println(ll1.element()); // ilk elementi silmeden bize döndürür 10
                                           // ilk element yoksa exception fırlatır
        System.out.println(ll1); //[10, 20]

        System.out.println(ll1.getLast()); // son elementi silmeden bize döndürür
        System.out.println(ll1.getFirst()); // ilk elementi silmeden bize döndürür

        ll1.offer(30); // sona ekler ama bize bir şey döndürmez
        System.out.println(ll1); //[10, 20, 30]
        ll1.offerLast(40); // sona ekler ve bize true döndürür
        System.out.println(ll1); //[10, 20, 30, 40]
        ll1.offerFirst(50);
        System.out.println(ll1); //[10, 20, 30, 40, 50]

        System.out.println(ll1.peek()); // ilk elementi silmeden bize döndürür,
                                        // bulamazsa null döndürür

        ll1.poll();

    }
}
