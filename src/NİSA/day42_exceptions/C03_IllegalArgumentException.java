package NİSA.day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {


        /*
        Kullanıcıdan yaşını isteyin
        kullanıcı yaş olarak negatif bir sayı,
        0 veya
        120'den büyük bir sayı girerse illegalArgumentException oluşacak şekilde
        bir program yazınız
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas=scan.nextInt();

         if (yas<=0 || yas>12){
            // System.out.println("Lütfen geçerli bir yaş giriniz");
             // Java bizim istediğimiz durumlarda exception fırlatabilir
             throw new IllegalArgumentException();

         }else{
             System.out.println("Uygun yaş girdiniz, teşekkürler");
         }
    }
}
