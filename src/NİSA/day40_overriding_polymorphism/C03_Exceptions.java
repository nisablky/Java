package NİSA.day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı alıp, bölerek
        // sonucu yazdıran bir program yazınız

        Scanner scan = new Scanner(System.in);
        int kontrol=0;
        while(kontrol !=2){
            System.out.println("bölmek istediğiniz sayiyi yaziniz");
            int sayi1 = scan.nextInt();

            System.out.println("kaça bölmek istediğinizi yaziniz");
            int sayi2 = scan.nextInt();


            try {
                System.out.println("sonuç = " + sayi1/sayi2);
            } catch (ArithmeticException e) {
               // e.printStackTrace();
                System.out.println("girdiğiniz sayılarda sorun var");
            }


            System.out.println("devam etmek için 1 \nbitirmek için 2'ye basın");
            kontrol=scan.nextInt();
        }


        /*
        Sayi2 0 olduğunda sayi1/ 0 tanımsız olacağından
        Java bu durumla karşılaşınca exception verir
        Javanın yazdığı mesajda exception ne tur bir sorun olduğu
        Neden kaynaklandığı
        ve hangi satırda oluştuğu yazar

        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at NİSA.day40_overriding_polymorphism.C03_Exepcitions.main(C03_Exepcitions.java:20)

	    bunu çözmek için sayi2'yi if ile kontrol edebiliriz


        if (sayi2==0){
            System.out.println("sayi / 0 tanımsızdır");
        }else{
            System.out.println("sonuç = " + sayi1/sayi2);
        }


        Ama bu yöntem her sorunda çalışmaz
         */
    }
}
