package NİSA.day25_list;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {
        // verilen bir arrayden istenen elementi(kaçtane varsa) silip kalanları
        // yeni bir array olarak yazdıran bir method oluşturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;

        istenmeyenElementiSil(arr,istenmeyenEleman);
    }



























    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {

        //1- istenmeyen element sayısını bulalım
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenmeyenEleman) {
                sayac++;

            }
        }
        //2- yeni arrayi oluşturlarım
        int arrYeni[]=new int[arr.length-sayac];

        //3- eski arrayden uygun elementleri yeniye taşı
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] !=istenmeyenEleman){
                arrYeni[index]=arr[i];
                index++;
            }

        }

        // listeyi yazdırmak
        System.out.println(Arrays.toString(arrYeni));// [4, 2, 5, 7, 8, 5, 2, 4]
    }
}
