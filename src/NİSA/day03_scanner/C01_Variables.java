package NİSA.day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {
        // bir variable olustururken icerisine koyacagim datanin alabilecegi degerlere uygun
        // bir data turu saecmeliyiz
        // ornegin bir sehrin nufusundan bahsediyorsak
        // variable'imizin data turu String, boolean, char veya double olamaz
        // geriye kalan tamsayi turlerinden sehrin nufusunu icine alabilecek buyuklukte bir data turu seceiliriz
        // biz kurs boyunca genelde tam sayilar icin int, ondalikli sayilar icin double kullanacagiz

        String okulIsmi="Yıldız Koleji";
        System.out.println(okulIsmi); // Yıldız Koleji

        char ilkHarf;
        ilkHarf='H';
        System.out.println(ilkHarf);

        int num1=10, num2=20;
        System.out.println(num1+num2);

        String isim="Nezir";
        String soyIsım="Yıldız";
        System.out.println("İsminiz : " + isim);
        System.out.println("Soy İsminiz : " + soyIsım);


        short num3=20;
        double num4=30;

        System.out.println("İki sayının toplamı : "+ (num3 + num4)); // İki sayının toplamı : 50.0

        int num5=20;
        char harf='a';

        System.out.println(num5+harf); // 117

        int num6='a';

        System.out.println(num6); // 97

    }
}
