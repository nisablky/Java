package NİSA.day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args)  {

        /*
        Bir kod yazılırkenolası exception'lar öngörülüp
        exception oluştuğunda java'nın ne yapmasını istediğimiz
        belirtilmelidir

        1- Eğer exception oluştuğunda kodun devam etmesini istemiyorsak
           method isminin yanına oluşabilecek exception'ı deklare edebiliriz
        2- Eğer exception oluşsada kodun çalışmaya devam etmesini istiyorsak
           kodun oluşturabilecek kodu try catch bloğunun içine alır
           try bloğuna sorun çıkabilecek kodu
           catch bloğuna oluşabilecek exception'ı ve
           olası exception durumunda javanın ne yapmasını istediğimizi yazabiliriz
         */


        String dosyaYolu= "src/NİSA/day41_exceptions/dosya.text";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

