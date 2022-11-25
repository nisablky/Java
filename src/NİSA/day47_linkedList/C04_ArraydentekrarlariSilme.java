package NİSA.day47_linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_ArraydentekrarlariSilme {
    public static void main(String[] args) {

        // verilen bir array'den tekrar eden elementleri silip
        // unique elementler oluşan bir array haline döndüren bir method oluşturun

        Integer arr[] = {3,5,4,6,3,1,2,7,8,6,1,4,2,8};

        arr = benzersizYap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static Integer[] benzersizYap(Integer[] arr) {

        Set<Integer> benzersizSet = new TreeSet<>();
        for (Integer each: arr
             ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet); //[1, 2, 3, 4, 5, 6, 7, 8]
        // set'de index yapısı yoktur, dolayısıyla forloop kullanamayız

        Integer arrBenzersiz[]= new Integer[benzersizSet.size()];
        int index=0;
        for (Integer each: benzersizSet
             ) {
            arrBenzersiz[index]=each;
            index++;
        }
        return arrBenzersiz;
    }
}
