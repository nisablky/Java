package NİSA.day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        java pass by value bir programlama dilidir
        Yani bir primitive variable'ı argument olarak bir method'a yollarsanız
        Java o variable'i değil, değerini(value) method'a aktarır (pass)
         */
        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main method'da etiket fiyatı : " + etiketFiyati);
    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {

        etiketFiyati=etiketFiyati* 0.90;
        System.out.println("sizin için %10 indirimli fiyatımız : " + etiketFiyati);
    }
}
