package NİSA.day25_list;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();
        harfler.add("D"); // [D]
        harfler.add("M"); // [D, M]
        harfler.add(1,"T"); // [D, T, M]
        harfler.add(0,"T"); // [T, D, T, M]

        System.out.println(harfler);

        System.out.println(harfler.contains("T")); // True
        System.out.println(harfler.contains("F")); // False



        List<String> karakterler = new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");

        System.out.println(harfler.containsAll(karakterler)); // true

        karakterler.add("F");

        System.out.println(harfler.containsAll(karakterler)); // false
        System.out.println(karakterler.size()); // 3




    }
}
