package NİSA.day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {


        //kullanıcıdan kaç elemetlik bir arr oluşturucağını sorun arr i oluşturup elementleri kullanıcıdan alıp arr e atayın


        Scanner scan = new  Scanner(System.in);
        System.out.println("Lütfen kaç elementli bir arr istediğinizi yazın");
        int  uzunluk =scan.nextInt();

        int arr[] = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("arr için "+(i+1) + "eleman giriniz" );
            arr[i]=scan.nextInt();

        }
        System.out.println("girilen arr ler : " + Arrays.toString(arr));
    }
}
