package NİSA.day34_accessModifier_encapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01 obj= new C01();

        obj.acıkString="Bye";
        C01.acıkSayi=50;

       // C01.sayi=15; private access modifier'i olduğundan başka classdan erişilemez


       // obj.method1;  private access modifier'i olduğundan başka classdan erişilemez


       // C01 objParametreli= new C01(5);  private access modifier'i olduğundan başka classdan erişilemez

    }
}
