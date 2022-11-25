package NİSA.day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {
        //Kullanıcıdan toplamak istediği sayıları alın ve
        //kullanıcı 0 a basana kadar devam edin
        // kullanıcı 0 a bastığında
        //girilen tum sayıların toplaını yazsın

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        for (int i = 1; i < 100000; i++) {
            System.out.println("Lütfen bir sayı giriniz");
            sayi = scan.nextInt();


            if (sayi == 0) {
                break;
            } else {
                toplam += sayi;

            }

        }
        System.out.println(toplam);


        sayi = 1;
        toplam = 0;

        while (sayi != 0) {
            System.out.println("Lütfen bir sayı giriniz");
            sayi = scan.nextInt();
            toplam += sayi;

        }
        System.out.println(toplam);

        // baslangıç  bitiş ve değişim değerleri net olan durumlarda for loop daha avantajlıdır...
        // ama adım sayısı belli olmayan durumlarda while loop daha avantajlıdır...



    }
}
