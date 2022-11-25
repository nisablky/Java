package NİSA.day40_overriding_polymorphism;

public class C02 extends C01{


    private void method4(){
        System.out.println("child method 4");
        //Parent class'daki private method 4'e
        //Child class'dan ulaşmamız mümkğn olmadığından
        //Java bu iki method'u
        //TAMAMEN FARKLI İKİ METHOD olarak kabul eder
        //@Override kullanmak istersek Java kabul etmez CTE verir
    }



    @Override
    protected String method3(){
        //Covariant için yazıldı
        return "Java";
    }


    @Override
    public void method2() {
        /*
        @Override notasyonu overridden method ile overriding method'u
        birbirine bağlar
        Farkında olunmadan overridden method silinirse veya signature değiştirilirse
        bu ilişki bozulacağı için Java CTE verir

        Notasyon kullanılmazsa Java bunların ilişkisini bilir ama
        overridden method silinirse sesini çıkarmaz
         */
        System.out.println("child method 2");
    }

    public static void main(String[] args) {

        C02 obj = new C02();
        obj.method1();//parent method 1
        obj.method2();//child method 2


        C01 obj2 = new C02();
        obj2.method1();//parent method 1
        obj2.method2();//child method 2

        C01 obj3 = new C01();
        obj3.method1();//parent method 1
        obj3.method2();//parent method 2
    }
}
