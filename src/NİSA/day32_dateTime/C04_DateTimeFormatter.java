package NİSA.day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println(tarihSaat);//2022-08-29T16:02:59.839911400

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        System.out.println(formatter.format(tarihSaat));//29/8/2022

        DateTimeFormatter formatterSaat = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(formatterSaat.format(tarihSaat));//16:16


        /*
        y	Yıl	1996; 96
        M	Yıl içinde ay	July; Jul; 07
        w	Yıl içinde hafta	27
        W	Ay içinde hafta	2
        D	Yıl içinde gün	189
        d	Ay içinde gün	10
        F	Ay içinde haftanın günü	2
        E	Haftanın günü	Tuesday; Tue


        a	Sabah/akşam	PM
        H	Gün içinde saat (0-23)	0
        k	Gün içinde saat (1-24)	24
        K	Sabah/akşam için saat (0-11)	0
        h	Sabah/akşam için saat (1-12)	12


        m	Saat içinde dakika	30
        s	Dakika içinde saniye	55
        S	Milisaniye

         */
    }
}
