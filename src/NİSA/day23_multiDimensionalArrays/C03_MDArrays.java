package NİSA.day23_multiDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {

        // boyutları belirli bir array i elementleri girmeden oluşturalım

        // bir okula icinde 24 öğrenci olan 8 sınıf vardır.

        int arr[][] = new int[8][24];

        // bir ilcede herbirinde 24 öğrencilik 8sınıf bulunan 5 okul vardır

        int ilce[][][]=new int[5][8][24];

        // bir okulda 3 tane 24 kişilik 2 tanede 22 kişilik sınıf vardır

        int sinif24[][]= new int[3][24];
        int sinif22[][]= new int[2][22];

        //oluştururken elementleri atama yaparsak farklı uzaklıkta innwe array'ler tanımlanabilir.

        int arr1 [][]= {{3,1,7},{6,2,10}};




    }
}
