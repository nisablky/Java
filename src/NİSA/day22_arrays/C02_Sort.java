package NİSA.day22_arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        // verilen bir array den en küçük ve en büyük değerleri yazdırın



        int arr[]={3,5,6,1,9,45,25,4,9,0};

        // sort methodu olmadan yapalım


        int enKucukSayi=Integer.MAX_VALUE;
        int enBuyukSayi=Integer.MIN_VALUE;



        for (int i = 0; i <arr.length; i++) {

            if (arr[i]<enKucukSayi){

                enKucukSayi=arr[i];

            }
            if (arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];

            }
        }
        System.out.println("Array'deki en kucuk sayı : " + enKucukSayi); // 0
        System.out.println("Array'deki en büyük sayı : " + enBuyukSayi); // 45


        Arrays.sort(arr);

        System.out.println("Array'deki en kucuk sayı : " + arr[0]); // 0
        System.out.println("Array'deki en büyük sayı : " + arr[arr.length-1]); // 45

    }
}
