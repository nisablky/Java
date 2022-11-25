package NİSA.day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr [][]= {{3,1,7},{6,2,10}};


        System.out.println(arr[0][2]); // 7
        System.out.println(arr[1][2]); //10


        // ilk inner array'in tüm elementlerini yazdırın

        System.out.println(Arrays.toString(arr)); //[[I@58ceff1, [I@7c30a502]
        System.out.println(Arrays.toString(arr[0])); //[3, 1, 7]

        // MDA de tüm elementleri bir array olarak yazdırmak istersek

        System.out.println(Arrays.deepToString(arr)); //[[3, 1, 7], [6, 2, 10]]




    }
}
