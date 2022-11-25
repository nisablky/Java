package NİSA.day40_overriding_polymorphism;

import java.util.Queue;
import java.util.Scanner;

public class C05_Exception {
    public static void main(String[] args) {
        // kullanıcıdan istediği kadar sayıyı alıp toplayan bir program yazınız
        // toplam 500'u geçerse programı bitirsin veya
        // kullanıcı bitirmek istediğinde Q'ya basmalıdır

        Scanner scan = new Scanner(System.in);
        int toplam =0;

        do {
            System.out.println("lütfen toplamak istediğiniz sayiyi giriniz \nbitirmek için Q'ya basınız");
            int sayi = 0;



            try {
                sayi = scan.nextInt();
                toplam+=sayi;
            } catch (Exception e) {
                String hataliGiris = scan.next();
                if (hataliGiris.equalsIgnoreCase("q")){
                    break;

                }else{
                    System.out.println("hatalı giriş");
                }
            }



        }while(toplam<500);
        System.out.println("girdiğiniz sayiların toplamı : "+ toplam);
    }

}
