package NİSA.day18_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {


        // kullanıcıdan istediği kadar sayı girmesini isteyin
        // kullanıcının girdiği sayılar 500 u gecerse
        //artık yeter çok sayı girdin, toplam..... oldu yazsın


        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        while (toplam<500){
            System.out.println("Lütfen bir sayı giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
        }


        System.out.println("artık yeter çok sayı girdin girilen sayıların toplamı : " + toplam) ;

    }
}
