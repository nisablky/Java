package NİSA.day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {
        /*   Static variable'lar direk clas'a bağlıdır
             Class içerisinde yapılan her türlü değişiklik static variable'larda kalıcı olur

             Instance variable'lar ise objeye bağlıdır
             Instance variable'lara sadece obje üzerinden erişilebilir
             ve bir obje üzerinden eriilerek yapılan değişiklik
             Instance variable'in değerini tüm objeler için kalıcı olarak değiştirmez
             sadece o obje için ınstance variable değerini kalıcı olarak değiştirir


         */

        System.out.println("sayi1 : " + sayi1);//sayi1 : 0
        //System.out.println("sayi2 : " + sayi2); satatic olmadığı için main method'dan direk kullanamayız

        StaticKeyword obj1= new StaticKeyword();
        System.out.println(obj1.sayi2);//0


        sayi1++;
        obj1.sayi2++;

        System.out.println("sayi1 : " + sayi1);//sayi1 : 1
        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//1

        StaticKeyword obj2=new StaticKeyword();
        System.out.println(obj2.sayi2);//0
        System.out.println(obj2.sayi1);//1

        obj2.sayi1++;
        obj2.sayi2++;
        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1);//2

        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//2

        obj1.sayi1++;
        obj1.sayi2++;
        System.out.println(obj1.sayi2);//2
        System.out.println(obj1.sayi1);//3

        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1);//3


    }

}
