package NİSA.day18_nestedForLoop;

import java.util.Scanner;

public class H_sayiBulmaca {

    // bilgisayardan 1 ile 100 arasındaki bir sayı tutturun
    // kullanıcıdan bu sayıyı tahmin etmesini isteyin
    // girilen her tahminde sayıyı büyüt veya küçült diye yol gösterin
    // kullanıcı sayıyı bulduğunda kaç tahminde sayıyı bulduğunu kaullanıcıya yazdırın


    public static void main(String[] args) {

        int sayi = (int) (Math.random() * 100);

        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int denenenSayıAdeti = 0;

        System.out.println("1 ile 100 arası sayı giriniz");


        while (sayi != tahmin) {
            System.out.print("Tahmin ettiğiniz sayıyı giriniz: ");

            tahmin = scan.nextInt();

            denenenSayıAdeti++;

            if (tahmin == sayi) {
                System.out.println(denenenSayıAdeti + " kere deneme ile doğru tahmini buldunuz");
                System.out.println("Designed By Oğuzhan BALKAYA");

            } else if (tahmin > sayi) {
                System.out.println("Tahmini Azaltın");

            } else {
                System.out.println("Tahmini Arttırın");

            }
        }


    }
}
// Oğuzhan BALKAYA