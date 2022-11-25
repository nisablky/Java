package NİSA.day05_matematikselIslemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int num1=10;
        int num2=20;
        int num3=30;

        num2=num1++;

        System.out.println(num1 + " , " + num2 + " , " +num3);


        num3=++num1;


        System.out.println(num1 + " , " + num2 + " , " +num3);

        System.out.println(num3++); //12 önce yazdıracak sonra artıracak
                                    // once 12 yazdıracak sonra sayı3=13

        System.out.println(--num2); // önce azalt sonra yazdır
                                    // önce sayı2=9 sonra sayı2nin değeri yani 9 yazdırır



    }
}
