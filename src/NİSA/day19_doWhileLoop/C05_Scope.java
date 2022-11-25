package NİSA.day19_doWhileLoop;

public class C05_Scope {
    public static void main(String[] args) {
        // 1- method içerisinde oluşturulan variable lar sadece oluşturuldukları
        // method da methodta kullanıla bilirler, başka methodlarda kullanılamazlar
        //2- tüm methodların kullanılması bilmesini istediğimiz variable ları
        // class leval oluştururuz.
        // Class levelde oluşturduğumuz variable
        // --- static yaparsak tüm methodlar kullana bilir
        // --- stati olmaz ise (instance) ozaman sadece static olmayan methodlar kullanabilir.
        //3- loop içinde oluşturulan variable ler loop içinde kullanılabilirler amma
        // loop dışında kullanılmaz.


        int sayı = 10;
        //   isim="Ali Can"
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }

    static String kurs = "java";
    int level = 10;

    public static void method1() {
        //  sayı=20
        String isim = "Ali Can";
        System.out.println("kurs = " + kurs);
        //System.out.println("level = " + level);


    }

    public void method2() {
        //  sayı=30;
        //  isim="ayce sa"
        System.out.println("kurs = " + kurs);
        System.out.println("level = " + level);
    }


}
