package NİSA.day38_inheritance_overriding;

public class Ustabasi extends Isci{

    public String satatu="Ustabasi";
    public String haklar= "Ustabasi haftada bir gün ekstra tatil hakkına sahiptir";

    public void mesai(){
        System.out.println("Ariza varsa Ustabasi ekstra ücret almadan çalışır");
    }


    public void maasHesapla(){
        System.out.println("Ustabasi 30 gun * 8 saat * 12 euro = " + (30*8*12) + " Euro maas alır.");
    }

    public static void main(String[] args) {
        /*
        içinde olduğumuz class'dan klasik haliyle bir obje oluşturursak
        o obje ile çağırdığımız variable ve method'larda
        java önce içinde bulunduğumuz class'a bakar
        aradığımız class üyesi, içinde olduğumuz class'da varsa
        bize onu getirir
        YOKSA,
        parent class(lar)a bakar, ilk bulduğunu getirir
         */
        Ustabasi yasin = new Ustabasi();
        System.out.println(yasin.satatu);//Ustabasi
        System.out.println(yasin.haklar);//Ustabasi haftada bir gün ekstra tatil hakkına sahiptir
        System.out.println(yasin.ikramiye);//Isciler yılda bir ikremiye alır
        System.out.println(yasin.izin);//Isciler yılda bir ikremiye alır
        yasin.maasHesapla();//Ustabasi 30 gun * 8 saat * 12 euro = 2880 Euro maas alır.
        yasin.mesai();//Ariza varsa Ustabasi ekstra ücret almadan çalışır


        /*
        eğer isci olarak özelliklerini görmek istersek
        class adını (Data turu) ısci seçeriz
         */
        Isci ahmet = new Ustabasi();
        System.out.println(ahmet.satatu);//Isci
        System.out.println(ahmet.haklar);//Isciler kidem tazminatı alırlar
        System.out.println(ahmet.ikramiye);//Isciler yılda bir ikremiye alır
        System.out.println(ahmet.izin);//Tum personel yilda 4 hafta izin kullanabilir
        ahmet.maasHesapla();//Ustabasi 30 gun * 8 saat * 12 euro = 2880 Euro maas alır.
        ahmet.mesai();//Ariza varsa Ustabasi ekstra ücret almadan çalışır


        /*
        siz bir objeyi hangi class'dan tanımlarsanız o class'a ait özelliklere sahip olur
         */
        Personel adem= new Ustabasi();
        System.out.println(adem.satatu);//Personel
        System.out.println(adem.haklar);//Tum personel esit haklara sahiptir
        // System.out.println(adem.ikramiye);//CTE verir
        System.out.println(adem.izin);//Tum personel yilda 4 hafta izin kullanabilir
        adem.maasHesapla();//Ustabasi 30 gun * 8 saat * 12 euro = 2880 Euro maas alır.
        adem.mesai();//Ariza varsa Ustabasi ekstra ücret almadan çalışır

        /*
        Personel adem= new Ustabasi(); Bu bir Ustabasi objesidir
        Ustabasi 30 gun * 8 saat * 12 euro = 2880 Euro maas alır.
        Ariza varsa Ustabasi ekstra ücret almadan çalışır

        Personel adem= new Personel(); Bu bir Personel objesidir
         */

        /*
        Personel adem= new Ustabasi();

        ademin data türü personeldir
        böylece biz adem'in ne olarak isimlendirdiğimizi bilebiliriz
        ancak ben adem'in ustabasi olduğunu biliyorum
        çünkü constructor'ı ustabasi
        ama bu yazım formatı ile
        adem'in tüm personel ile birlikte sahip olduğu
        ortak özellikleri vurgulamak istiyorum

        Bu kullanım şeklinde oluşturulan obje data türü olarak secilen class
        ve onun parent class'larındaki variable'ları kullanabilir.
         */



    }
}
