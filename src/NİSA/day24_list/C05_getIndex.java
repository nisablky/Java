package NİSA.day24_list;

import java.util.ArrayList;
import java.util.List;

public class C05_getIndex {
    public static void main(String[] args) {


        List<Integer> sayılarList = new ArrayList<>();
        sayılarList.add(5);
        sayılarList.add(3);
        sayılarList.add(0,7);
        sayılarList.add(2,7);//[7, 5, 7, 3]

        System.out.println(sayılarList.get(2) );//7
        System.out.println(sayılarList);//[7, 5, 7, 3]

    }
}
