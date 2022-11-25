package NİSA.day39_overriding;

public class Toyota extends Araba {

    String hiz="Toyota araçlar max 220 km hiz yapar";
    String marka="Toyota";
    String sirketMerkezi="Japonya";



    public void motor(){
        System.out.println("Toyota arabalar toyota marka motor kullanır");
    }


    public void garanti(){
        System.out.println("Toyota araçlar 10 yil garantilidir");
    }
}
