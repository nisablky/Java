package NİSA.day30_passByValue;

public class C05_PassByValue {
    //kalıcı indirim için ikinci yöntem

    public static void main(String[] args) {

        double etiketFiyati=100;
        double indirimYuzdesi=10;


        etiketFiyati= kalıcıIndirimYap(etiketFiyati,indirimYuzdesi);
        System.out.println("main method'da  indirim sonrası etiket fiyatı : " + etiketFiyati);

    }

    public static double kalıcıIndirimYap(double etiketFiyati, double indirimYuzdesi){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat : "+ etiketFiyati);
        return etiketFiyati;

    }
 }












