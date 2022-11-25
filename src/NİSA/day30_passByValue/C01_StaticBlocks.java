package NİSA.day30_passByValue;

public class C01_StaticBlocks {

    static{
        /*
        static block class ilk  çalışmaya başladığında devreye girer
        ve class'ın çalışması için gerekli ön hazırlıklar için kullanılır
        yazıldığı satırın hiç bir önemi yoktur, class içerisinde istenen yerde yazılabilir
        static block birden fazla olursa, blocklar yukarıdaan aşağı doğru sırayla çalışır
         */
        System.out.println("Static block1 çalıştı");
    }
     static{
         System.out.println("Static block2 çalıştı");
     }


    C01_StaticBlocks(){
        System.out.println("constructor çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("main method başlangıcı");

        C01_StaticBlocks obj1;
        new C01_StaticBlocks();

    }
}
