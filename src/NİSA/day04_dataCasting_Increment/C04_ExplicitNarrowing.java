package NİSA.day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {

        int num1=879;

        double num2=10;

        double num3=num1/num2; // 87.9

        System.out.println(num3); // 87.9


        int num4 = (int) (num1/num2); // 87.9
                                 // değer double variable int
                                 // yani variable daha dar dolayısıyla java bunu otomatik olarak yapmaz
                                 // sorumluluğu üstlenmemizi ister
                                 //sağtarafa yazdığımız (int) sorumlulık bende demek

        System.out.println(num4);// 87


        int num5=140;
        byte num6=(byte)num5; // sağ taraftaki int > sol taraftakı variable byte

        System.out.println(num6);

        num5=130;
        num6=(byte)num5;
        System.out.println(num6); //-126

        num5=260;
        num6=(byte)num5;
        System.out.println(num6); //4

        num5=256;
        num6=(byte)num5;
        System.out.println(num6); //0








    }
}
