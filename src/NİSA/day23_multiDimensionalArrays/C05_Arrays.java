package NİSA.day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        // verilen bir array e yeni bir element ekleyen bir method oluşturun


        int arr[]={3,5,7};

       // arr[3]=8; //ArrayIndexOutOfBoundsException // arr de olmayan bir index e atama yapamayız

       // arr={1,3,5,6}; // var olan bir array e aynı boyutta bile olsa yeni değerler içeren bir değer atauyamayız

        arr = new int[4]; // [0, 0, 0, 0]
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0]

        int arrYeni[]= new int[5];

        arr=arrYeni;

        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0]

        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni;
        System.out.println(Arrays.toString(arr)); //[2, 0, 0, 5, 0]

        // bir array e icinde hazır elementleri oldugu yeni bir array atamak istersek
        // bunu {1,2,3,} şeklinde yazarak değil
        // new int[3] diyerek oluşturup sonra değer atayarak tamamladığımız bir array i
        //assing ederek yapabiliriz


        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]







    }
}
