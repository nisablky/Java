package NİSA.day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {

        // verilen bir array e yeni bir element ekleyen bir method oluşturun

        int arr[]={3,5,7};
        int eklenecekElement=4;

        arr=arrayeElemanEkle(arr, eklenecekElement);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {

        int yeniArr[]=new int[arr.length+1]; //[0,0,0,0]
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];

        }

        yeniArr[yeniArr.length-1]=eklenecekElement;
        return  yeniArr;
    }
}
