package NİSA.day07_ifElseStatements;

public class C01_IfStatements {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a == b) {

            System.out.println("verilen sayılar eşit");

        }

        if (a > 100) {

            System.out.println("a yüzden büyük");
            {
            }

            if (a * b > 1) {
                System.out.println("sayıların çarpımı 5 ten büyüktür");
            }
            // bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler
            // bir sart ve o sarta bagli sonuca odaklidir
            // birden fazla bagimsiz if cumlesi oldugunda hepsinin body calisabilecegi gibi
            //  hicbirisinin body'si calismayada bilir

        }
    }

}
