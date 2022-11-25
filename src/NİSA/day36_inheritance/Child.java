package NİSA.day36_inheritance;

public class Child extends  Parent{


    Child(){
        super();
        System.out.println("Child cons. çalıştı");
    }

    //tüm classlarda biz görmesek bile
    //Javanın oluşturduğu default constructor vardır

    //extend keyword kullanan class'lardaki
    //tüm constructor'ların ilk satırında
    // biz görmesek bile super()
    //constructor call vardır
    //yani parent class'ın parametresiz constructor call

    public static void main(String[] args) {

        Child child = new Child();

    }

}
