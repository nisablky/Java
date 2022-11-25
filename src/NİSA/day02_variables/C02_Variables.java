package NİSA.day02_variables;

public class C02_Variables {
    public static void main(String[] args) {
        // java çalışmaya main method da başlar
        // sonra yukarıdan aşağı soldan sağa doğru çalışır



        // eğer istersek bir variable i önce declare edip sonra değer ataya biliriz.

        String okulİsmi;


        okulİsmi="Yıldız Koleji";
        System.out.println(okulİsmi); // Yıldız Koleji



        okulİsmi="Star Koleji";

        System.out.println(okulİsmi); // Star Koleji

        okulİsmi="Java Koleji";

        System.out.println(okulİsmi); // Java Koleji

        // Println ile Print arasındaki fark
        // println dediğimizde yazdırma işleminde alt satıra geçeerken
        // print dediğimizde yazdırma işleminden sonra alt satıra geçmez

        System.out.println(okulİsmi); // Java Koleji
        System.out.println(okulİsmi); // Java Koleji Java Koleji
    }
}
