package NİSA.day39_overriding;

public class OverridingChild extends OverridingParent{

    public  void method1(){
        System.out.println("child class method1");
    }


    public static void main(String[] args) {

        /*
        Bir obje oluşturulurken Data turu ve Constructor ayni class'dan seçilmişse
        Java direk o class'a gider
        hem variable hem de method için
        o class'da varsa kullanır, yoksa o class'ın
        parent'larına bakar
         */

        OverridingChild obj1 = new OverridingChild();
        obj1.method1();//child class method1
        obj1.method2();//parent class method2

        OverridingParent obj3 = new OverridingParent();
        obj3.method2();//parent class method2
        obj3.method1();//parent class method1

        /*
        Eğer Data turu parent, constructor child class'dan seçildiyse
        variable'larda yukarıdaki sekilde çalışma devam eder
        Ancak
        Methodlar için Data turunun olduğu class'daki method
        Child class tarafından OVERRİDE edilmiş mi diye kontrol etmemiz gerekir
        Eğer child class'larda bu method override edilmişse
        override eden method çalışır
         */
        OverridingParent obj2 = new OverridingChild();
        obj2.method2();//parent class method2
        obj2.method1();//child class method1

    }

}
