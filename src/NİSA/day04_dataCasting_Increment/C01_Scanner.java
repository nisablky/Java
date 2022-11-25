package NİSA.day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        // soru7 kullanıcıdan ismini alıp baş harfını getirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi Giriniz....");
        char ilkharf= scan.next().charAt(0);
        // charAt(index) method'u parametre olarak yazdığımız index'deki  char'ı bize getirir
        //String'de index 0'dan başlar
        // E R S İ N
        System.out.println("Girdiğiniz İlk Harf : " + ilkharf);

    }
}
