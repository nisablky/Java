package NİSA.day37_inheritance;

import NİSA.day36_inheritance.Parent;

public class Child extends Parent {

    // Bir class'ı child class yaptığımızda
    // parent class'daki constructor'a ulaşması gerekir
    // bu durumda parent class'daki constructor'ın
    // access modifier'ı uygun  bir modifier yapılmalıdır

    // child class 'da tüm constructor'ların ilk satırına
    // Java'nın yerleştirdiği constructor PARAMETRESİZ dir yani super()

    Child(){
        super();

        System.out.println("child class parametresiz cons.");
    }
    Child(int s){
        // child class 'da tüm constructor'ların ilk satırına
        // Java'nın yerleştirdiği constructor PARAMETRESİZ dir yani super()

        System.out.println("child class parametreli cons.");
    }
    Child (int sayi1, int sayi2){
        // Eğer parent class'dan parametresiz constructor'i değil de
        // başka bir constructor'i çalıştırmak isterseniz
        // bunu child class'daki constructor'ın ILK SATIRINA yazmalısınız
        super(sayi1,sayi2);
        System.out.println("child iki parametreli cons.");
    }

    public static void main(String[] args) {
        Child child= new Child(5,8);

    }
}
