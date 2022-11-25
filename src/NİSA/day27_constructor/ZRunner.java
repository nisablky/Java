package NİSA.day27_constructor;

public class ZRunner {
    public static void main(String[] args) {

        Z obj1 = new Z("Emre", "Gülser", 44 , true);
        System.out.println(obj1);//Isım : Emre, Soyısım : Gülser, Numara : 44

        Z obj2 = new Z("Emre", "Dh", 55);
        System.out.println(obj2);//Isım : Emre, Soyısım : Dh, Numara : 55

        Z obj3 = new Z("Ali", "Can", 50);


    }
}
