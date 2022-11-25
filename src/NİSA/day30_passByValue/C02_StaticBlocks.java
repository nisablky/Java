package NİSA.day30_passByValue;

public class C02_StaticBlocks {

    {
        /*
        static olmayan blocklar ise obje oluşturullurken çalışır

        static blocklar sadece bir kere en başta çalışır ama
        static olmayan blocklar her obje oluşturulurken yeniden çalışır
         */


        System.out.println("static olmayan block çalıştı ");
    }

    static{
        System.out.println("static block çalıştı ");
    }


    public static void main(String[] args) {
        System.out.println("main method başı");


        C02_StaticBlocks obj1= new C02_StaticBlocks();
        C02_StaticBlocks obj2= new C02_StaticBlocks();
    }
}
