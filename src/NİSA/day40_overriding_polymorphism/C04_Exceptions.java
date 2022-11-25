package NİSA.day40_overriding_polymorphism;

public class C04_Exceptions {
    public static void main(String[] args) {

        //String olarak verilen bir sayiyi, integer'a çevirip
        //2 katını ekranda yazdıralım

        String str= "1234a";


        //str içinde sayi olmayan bir karakter olursa
        //NumberFormatException.forInputString verir



        try{
            int sayi= Integer.parseInt(str);
            System.out.println("girilen sayının 2 katı = " + 2*sayi);
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("girdiğiniz string sayi olmayan elementler içeriyor");
        }


    }
}
