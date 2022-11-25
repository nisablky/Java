package NİSA.day35_inheritace;

public class Child01 extends Parent{
    public static void main(String[] args) {
        /*
        Child class hiç bir objeye ihtiyaç duymadan
        parent class'daki variable ve method' lara ulaşabilir

         */
        System.out.println(isim);// Neval
        System.out.println(fabrika);//Yildiz Tekstil
        method1();
        method2();
    }
}
