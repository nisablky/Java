package NİSA.day45_interfaces;

public interface I01_Default_Static {

    /*
    Interface'lerde sadece abstract method'lar bulunur
    body'si olan concrete bir method oluşturmak istediğimizde
    Java CTE verir

    Ancak Java8 ve üzeri versiyonlarda, istisnai olarak
    static veya default olarak tanımlanan method'ların body'si olabilir
    ancak burada kullanılan default keyword'u access modifier değildir
    çünkü Interface'lerde tüm method'lar public ve abstract'tı

    aşağıdaki örnekte görüleceği gibi default olarak tanımlanmış
    bir method'a access modifier olarak public yazabiliriz
    (access modifier yazmasak da Java method' public olarak kabul edecektir )
     */


    void method1();

   public default void method2(){
       System.out.println("Interface'deki default method");

    }

    static void method3(){
        System.out.println("Interface'deki static method");
    }
}
