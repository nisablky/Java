package NİSA.day20_scope_Arrays;

public class C02_StaticVariables {

    // ıntance variable ler obje e bağlıdır ve her obje farklı değerler alabilirler
    // öğrenci notları veya öğretmen branşları gibi
    //bir objeye ait bir variable nin son değerini bulmak için sadece o objeyi dikkate alırız

    // static variabler ise class variable olarak tanımlanır.
    // ve tüm clas uyeleri için aynıdır. okul ismi okul müdürü adı gibi
    // eğer static variable in değeri değiştirilse herkes için değişir


   static String okulIsmi="Yıldız Koleji";
    static int okulNo;
    static boolean okulAcikmi;




    public static void main(String[] args) {

        System.out.println(okulIsmi); // Yıldız Koleji
        System.out.println(okulNo); // 0
        okulNo=102;
        System.out.println(okulNo); // 102
        System.out.println(okulAcikmi); //false

        staticMethod();

        System.out.println(okulNo); // 200


    }

    public static void  staticMethod(){

        okulNo=200;
        System.out.println(okulNo); // 200
    }
}
