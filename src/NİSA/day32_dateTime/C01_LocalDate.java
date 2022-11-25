package NİSA.day32_dateTime;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh = LocalDate.now();// objenin olduşturulduğu tarihi trh'ye atar
        LocalDate baskaTrh = LocalDate.of(2000,6,20);
        // istediğimiz yıl,ay ve gün değerlerine göre bize obje oluşturur


        System.out.println(trh);//2022-08-29
        //get'li method'larla tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth());//29
        System.out.println(trh.getDayOfWeek());//MONDAY
        System.out.println(trh.getMonthValue());//8
        System.out.println(trh.getYear());//2022


        //bir tarihten istediğimiz kadra ileri veya geri gidebiliriz

        System.out.println(trh.minusWeeks(20));//2022-04-11
        System.out.println(trh.minusWeeks(5).minusDays(3));//2022-07-22

        System.out.println(trh.plusMonths(9).plusDays(10));//2023-06-08

        //istediğimiz ülkenin o andaki tarihini elde etmek istersek

        LocalDate trhZone= LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);//2022-08-29

        // is ile başlayan method'lar boolean sonuçlar döndürür
        System.out.println(LocalDate.now().isLeapYear());//false
        System.out.println(trh.isAfter(baskaTrh));//true



    }
}
