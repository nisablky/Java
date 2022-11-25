package NİSA.day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {


        LocalTime tm= LocalTime.now();
        System.out.println(tm);//15:20:46.245843200

        // bir işlemin ne kadar sürede bittiğini bulmak istersek
        // işlemden önce ve sonra birer time objesi oluşturup
        // aradaki farki hesaplayabiliriz
        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;
            
        }
        LocalTime tmLoopSonrası= LocalTime.now();
        System.out.println(tmLoopSonrası);//15:25:52.083988400

       double nano1= tm.getNano();
       double nano2= tmLoopSonrası.getNano();

        System.out.println("işlem "+ (nano2-nano1)+ " nanosaniyede bitti");//işlem 1.59735E7 nanosaniyede bitti


        //ileri veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000));//08:13:09.851125400

      //istersek zon id kullanarak istediğimiz bölgenin saati için de obje oluşturabiliriz

    }
}
