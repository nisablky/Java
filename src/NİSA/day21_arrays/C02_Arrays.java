package NİSA.day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[] = {"Ali", "Veli", "Ayşe"};
        // array içindeki elementlere ulaşabilmek için index kullanırız.

        System.out.println(arr1[0]); // Ali

        arr1[1]="Esila";

        System.out.println(arr1[1]); // Esila

        // arrayin içindeki indexleri kullanarak elementlere kullanarak ulaşabilir ve update edebiliriz.

        int arr2[]= new int[4];

        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
        //System.out.println(arr2[5]);//ArrayIndexOutOfBoundsException


        // Array'in tamamını yazdırmak istersek.

        System.out.println(arr2); //[I@58ceff1
                                  // array'ler non primitive olduklarından direk yazdırmak istersek java referans bilgisini yazdırır.


        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
        // array'i Yazdırmak için arrays classındaki toString() kullanılır.

        System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0]


        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2));//[0, 11, 0, 22]

        System.out.println(Arrays.toString(arr1));//[Ali, Esila, Ayşe]



    }
}
