package NİSA.day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan yaricap isteyip
        // cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Cemberin Yarıçapını Giriniz");

        double yarıçap=scan.nextDouble();

        System.out.println("girdiğiniz yarı çap :  " + yarıçap);
        System.out.println("çemberin cevresi :  " +2*3.14*yarıçap);
        System.out.println("dairenin alanı :  " + 3.14* yarıçap*yarıçap);

    }
}
