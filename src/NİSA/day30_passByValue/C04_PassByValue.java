package NİSA.day30_passByValue;

public class C04_PassByValue {
    // eğer bir method da yapılan değişikliğin kalıcı olmasını istiyorsak
    // iki yöntem kullanabiliriz
    // 1-variable'i class level'da static olarak oluşturabilirim

    static double etiketFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {

        etiketFiyati = 100;
        indirimYuzdesi=10;
        kalıcıIndirimYap();
        indirimYuzdesi=15;
        kalıcıIndirimYap();
        indirimYuzdesi=15;
        kalıcıIndirimYap();


    }


    public static void kalıcıIndirimYap(){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat : "+ etiketFiyati);

    }
}
