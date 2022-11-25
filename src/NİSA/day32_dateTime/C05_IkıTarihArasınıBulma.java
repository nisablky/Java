package NİSA.day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkıTarihArasınıBulma {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(2000,06,20);
        System.out.println(Period.between(dogumGunu,bugun));//P22Y2M9D

        System.out.println(Period.between(dogumGunu,bugun).getYears());//22

        // FIXME: 29.08.2022
    }
}
