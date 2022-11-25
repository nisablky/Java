package NİSA.day30_passByValue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C06_PassByValue {
    public static void main(String[] args) {
        /*
        non primitive data türlerinde objenin kendisi değilde
        içindeki elementler değişirse
        Java objenin referansı ve objenin KENDİSİ değişmediği için
        element değişikliklerini kabul eder ve kalıcı yapar
         */



        int arr[]= {1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDeğiştir(arr);
        System.out.println("method call sonrası : "+  Arrays.toString(arr));
    }

    private static void arrDeğiştir(int[] arr) {

        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));
    }
}
