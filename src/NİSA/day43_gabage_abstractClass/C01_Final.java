package NİSA.day43_gabage_abstractClass;

public class C01_Final {

    final static double piSayisi=3.14;
    final static String okulIsmi="Yıldız koleji";


    public static void main(String[] args) {

        final int sayi=10;
       // okulIsmi="Java Koleji";  final olarak işaretlendiği için değiştirilemez



    }

    public final static void method1(){
        System.out.println("Parent class final method1");
    }
}
