package NİSA.day04_dataCasting_Increment;

public class C03_Casting {
    public static void main(String[] args) {
        int num1=8;
        int num2=4;

        System.out.println(num1/num2); //2

        num2=3;

        System.out.println(num1/num2); //2.66666=> 2

        num1=22;

        System.out.println(num1/num2); // 7.333333=> 7

        // java iki int sayıyı bir birine bölerse sonucuda int olarak verir
        // eğer virgülden sonra küsürat varsa siler

        num1=4786;
        num2=10;

        num1= num1/num2;

        System.out.println(num1); //478

        num1= num1/num2;

        System.out.println(num1); //47

        num1= num1/num2;

        System.out.println(num1); //4

        num1= num1/num2;

        System.out.println(num1); //0

        num1=4895;
        double num3=10;

        //num1=num1/num3; // iki farklı sayı data türünü koyduğumuzda
        // java küçük olan data türü için auto widening yapar
        // bu işlemi düşünürsek num1/num3 işlemin sonucunu double kabul eder

        System.out.println(num1/num3); //489,5

        System.out.println(num3/num1); // 0.0020429009193054137

    }
    }
