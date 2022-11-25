package NİSA.day21_arrays;

import java.util.Arrays;

public class  C03_Arrays {
    public static void main(String[] args) {

        int arr[]; // değer ataması yapmadık ama java kabul etti ancak kullanmamıza izin vermez



        arr=new int[6];
        System.out.println(Arrays.toString(arr));// [0, 0, 0, 0, 0, 0]
        System.out.println(arr.length); // 6
                                        // Stringteki length(), bunda yok.

        //arraydeki her bir elemanı index değeri kadar artiralım


        for (int i = 0; i < arr.length; i++) {
            arr[i] += i;


        }
        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5]



    // son index deki elementi yazdıralım
        System.out.println(arr[arr.length-1]); // 5
        System.out.println(arr[3]); // 3


    }
}
