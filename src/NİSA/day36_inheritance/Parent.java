package NİSA.day36_inheritance;

public class Parent {

    protected Parent(){

        System.out.println("Parent parametresiz cons. çalıştı");
    }

    protected Parent (int sayi3, int sayi4){
        System.out.println("parent iki parametreli cons.");
    }

    protected int sayi;

}
