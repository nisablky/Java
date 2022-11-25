package NİSA.day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {

        String dosyaYolu="src/NİSA/day41_exceptions/dosya.text";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k=0;
            while((k=fis.read()) != -1){
                System.out.print((char)k);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        Exception'lar için de parent child ilişkisi mevcuttur
        Eğer bir kod için birden fazla exception oluşma ihtimali varsa
        Öncelikle olası exception'lar parent-child ilişkisi taşıyor mu bakmamız gerekir
        Eğer parent child ilişkisi yoksa, istediğimiz sirada catch cümleleri oluşturabiliriz

        Eğer parent child ilişkisi varsa
        sadece parent exception'ı yazabiliriz
        veya ikisini de yazmak istersek
        child'i önce parent'i sonra yazmalıyız
         */




        /*
        Altı kırmızı çizili her kod CTE değildir
        Java syntax hatalarını derleme esnasında (compile) farkeder ve altını çizer
        biz bu güne kadar tamamına CTE diyorduk ancak
        exception konusu ile birlikte
        Compile Time Exception kavramı da hayatımıza girdi
         */

    }
}
