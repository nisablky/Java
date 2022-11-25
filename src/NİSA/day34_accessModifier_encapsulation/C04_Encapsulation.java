package NİSA.day34_accessModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {

        /* Bir variable'i encapsule etmek için
           1- Access modifier'ı private yaparız
           2- okuma ve yazma özelliklerinin kullanılmasını istediğimiz gibi sınırlayabiliriz
             - eğer sadece okunmasını istiyorsanız getter
             - sadece değer girilebilsin isterseniz setter
            methodlarını oluştururuz.

            Bir varriable için hem getter hem setter oluşturursanız
            o variable public olmuş gibi
            hem okuyup hem de yazılmasını sağlayabilirsiniz

            Piyasa da developer'lar arasında genel uygulama da böyledir

         */

        C03 obj=new C03();

        System.out.println(obj.getSayi());//0

        obj.setStr("Java, Java, Java");
        System.out.println(obj.getStr());//Java, Java, Java

        System.out.println(obj);//sayi=0, str='Java, Java, Java

}}
