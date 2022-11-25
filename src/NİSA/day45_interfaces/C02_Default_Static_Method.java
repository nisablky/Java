package NİSA.day45_interfaces;

public class C02_Default_Static_Method implements I01_Default_Static{

    /*
    Bir interface'de default veya static olarak tanımlanan ve body'si olan
    method'ların override edilmesi mecburi DEĞİLDİR
    Eğer static olarak tanımlanmışsa zaten override edemeyiz
     */

    @Override
    public void method1() {
        System.out.println("child class method1");
    }

    /*
    Parent Interface'deki default olarak tanımlanan method'u
    istersek override ederiz istersek etmeyiz
    override etmezsek, method çağırıldığında Parent Interface'deki çalışır
    override edersek, child clas'daki overriding method çalışır

    @Override
    public void method2() {
        System.out.println("child class method2");
    }

     */

    public static void main(String[] args) {
        //Interface'de static olarak tabımlanan method'lara
        //static yöntemlerle ulaşılabilir InterfaceIsmi.methodIsmi
        I01_Default_Static.method3();

        C02_Default_Static_Method obj = new C02_Default_Static_Method();
        obj.method1();//child class method1
        obj.method2();//Interface'deki default method
        // obj.method3();  eski classlarda static bir
        // üyeye static olmayan yollarla da ulaşabilirdik
        // ancak interface içerisinde static olarak tanımlanan method'a
        // static olmayan yöntemlerle ulaşılamaz


    }
}
