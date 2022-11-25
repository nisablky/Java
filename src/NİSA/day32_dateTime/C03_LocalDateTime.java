package NİSA.day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println(tarihSaat);//2022-08-29T15:56:24.716234600

        System.out.println(tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));
        //2025-11-08T21:05:27.792032700


    }
}
