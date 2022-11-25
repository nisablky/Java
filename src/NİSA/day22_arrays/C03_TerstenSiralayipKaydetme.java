package NİSA.day22_arrays;

import java.util.Arrays;

public class C03_TerstenSiralayipKaydetme {
    public static void main(String[] args) {
        // verilen bir arrayi büyükten kücüğe siralayıp bize döndüren bir method oluşturun

        int arr[]={3,5,6,1,9,45,25,4,9,0};

        arr=terstenSirali(arr);
        System.out.println(Arrays.toString(arr)); // [45, 25, 9, 9, 6, 5, 4, 3, 1, 0]
        System.out.println("En Büyük Element : " + arr[0]); // 45

    }

    public static int[] terstenSirali(int[] arr) {
        Arrays.sort(arr); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        int tersArr[]= new int[arr.length]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        for (int i = 0; i < arr.length; i++) {
            tersArr[i]=arr[arr.length-1-i];
        }
        return tersArr;
    }
}
