package NİSA.day29_staticKeyword;

public class C01_Static {

    String okulIsmi = "Yıldız Koloji";
    static String okulTelefonu = "3122563635";


    public static void staticMethod(){
        System.out.println("Static method calişti");

    }


    public void staticOlmayanMethod(){
        System.out.println("Static olmayan method calişti");
    }
}

