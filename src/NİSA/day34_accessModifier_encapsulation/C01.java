package NİSA.day34_accessModifier_encapsulation;

public class C01 {

    private static int sayi=10;
    private static  String str= "Java";
    static int acıkSayi=20;// access modifier'ı default Access Modifier
    String acıkString= "Hi"; // access modifier'ı default Access Modifier
    public static int halkaAcıkSayi= 15;
    protected static int aileyeOzel=40;
    protected C01(){
        // bu constructor'ın access modifier'ı
        // default access modifier'dır
        // dolaysıyla içinde olduğumuz paketin dışında
        // bu class'dan obje oluşturulamaz

    }

   private C01(int numara){
        System.out.println("parametreli constructor çalıştı");
    }

    private void method1(){

    }



}
