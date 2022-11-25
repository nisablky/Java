package NİSA.day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        /*
        Compare iki sb'i eşit mi diye kontrol etmek için
        ilk harften başlayarak tüm karakterleri karşılaştırır
        Aynı olan karakterler için bir şey yazdırmaz
        farklı olan ilk karakter için ascii tablosuna göre kaç değer geride veya ileride
        olduğunu yazdırır
        Tamamen aynı ise biz 0 döndürür

        bir sb ile bir String'i compare etmek istersek Java CTE verir
         */

        StringBuilder sb1= new StringBuilder("Ali Can");
        StringBuilder sb2= new StringBuilder("Ali Can");

        String str= "Ali Can";

        System.out.println(sb1.compareTo(sb2));//3

       // System.out.println(sb1.compareTo(str));

        //SB' da equals methodu Stringdeki == gibi çalışır
        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true

        System.out.println(sb1.equals(str));//false

        //System.out.println(sb1==str);//farklı obje türleri olduğu için java kıyas yapmaz


    }
}
