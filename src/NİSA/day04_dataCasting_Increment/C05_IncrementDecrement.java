package NİSA.day04_dataCasting_Increment;

public class C05_IncrementDecrement {

    public static void main(String[] args) {

        int num1=20;

        System.out.println(num1+10); // 30
        // bu satırda sayı 10 artırmadım
        // sayının 10 fazlasını yazdırdım


        System.out.println(num1); // 20

        // eğer atama yazmazsak sayıda yaptığımız artırma veya azaltma kalıcı olmaz

        num1=num1+10;

        System.out.println(num1); //30

        System.out.println(num1=num1+=10); //40

        System.out.println(num1); //40

        System.out.println(num1+=10); //50

        // bir variable' ın değerini kalıcı olarak artırmak veya azzaltmak istersek assigment şarttır

        System.out.println("30. satır  "+num1++);
        System.out.println("31. satır  "+num1);


        System.out.println("34. satır  "+ ++num1);
        System.out.println("35. satır  "+ num1);






    }
}
