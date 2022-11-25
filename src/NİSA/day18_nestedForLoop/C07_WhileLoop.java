package NİSA.day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // Kullanıcıdan kaç sayı toplamak istediğiniz alın
        // bu sayıların alın ve bu sayılarının toplamını ekrana yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet giriceksiniz");
        int sayiAdeti=scan.nextInt();
        int sayi=0;
        int toplam=0;


        for (int i =1; i <=sayiAdeti ; i++) {
            System.out.println("Lütfen bir sayı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }

        System.out.println("girilen sayı adeti : " + sayiAdeti + "sayıların toplamı : " + toplam);



            // while ile yapalım

        sayi=0;
        toplam=0;

        int sayac=1;
        while(sayac<=sayiAdeti){
            System.out.println("Lütfen bir sayı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;

        }

        System.out.println("girilen sayı adeti : " + sayiAdeti + "sayıların toplamı : " + toplam);




    }


}
