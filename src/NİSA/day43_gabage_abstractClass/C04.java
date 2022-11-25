package NİSA.day43_gabage_abstractClass;

public abstract class C04 {
    /*
    bir abstract class'da absract veya concrete method'lar bulunabilir
    Child Class'ların abstract method'ları override etmesi MECBURİ iken
                       concrete method'ların override edilmesi OPSİYONEL'dir
     */

    public abstract void absMethod();

    public void concreteMethod(){
        System.out.println("C04  concrete method");
    }

    public static void concreteStaticMethod(){
        System.out.println("C04  concrete static method");
    }

    public  static void main(String[] args) {
        /*
        Abstract class'lar constructor'a sahiptir
        ancak Abstract class'lardan OBJE OLUŞTURULAMAZ

        Abstract class'lar OBJE BARINDIRMAYAN,
        sadece child class'lar için
        UYULMASI ŞART OLAN veya OPSİYONEL bırakılan
        özellikleri tanımladığımız bir depo class gibidir
         */
       // C04 obj=  new C04();

        System.out.println("Bu class abstract");
        concreteStaticMethod();
    }
}
