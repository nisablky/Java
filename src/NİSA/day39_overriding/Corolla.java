package NİSA.day39_overriding;

public class Corolla extends Toyota{

   protected String hiz="Corolla max 200km hiz yapar";
   protected String yakit="Corolla benzinli veya elektiriklidir";
   protected String model="Corolla";


    public void motor(){
        System.out.println("Corolla araçlar çevreci motor kullanır");
    }

    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 Lt yakit tüketir");
    }

    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }


    public static void main(String[] args) {

        /*
        Data turu veya constructor farklllı olduğunda
        Constructor çalıştığı için obje
        Constructor'ın olduğu class özelliklerini taşır
        ancak Data turu Parent class secildiği için
        variable'lar data türünün seçildiği class ve
        onun parent class'larından değer alabilir


        Method'lar için ise yine Data turunun olduğu class'a gideriz
        ancak direk method'u çalıştırmadan önce
        method Override edilmiş mi diye control ederiz
         */
        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket);//Araba
        System.out.println(arb1.hiz);//Corolla
        System.out.println(arb1.yakit);//Corolla
        System.out.println(arb1.marka);//Toyota
        System.out.println(arb1.sirketMerkezi);//Toyota
        System.out.println(arb1.model);//Corolla
        arb1.motor();//Corolla

        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket);//Araba
        System.out.println(arb2.hiz);//Toyota
        System.out.println(arb2.yakit);//Araba
        System.out.println(arb2.marka);//Toyota
        System.out.println(arb2.sirketMerkezi);//Toyota
        //System.out.println(arb2.model);// CTE
        arb2.motor();//Corolla
        arb2.garanti();//Toyota
        arb2.yakitTuketimi();//Corolla
        //arb2.vitesSayisi();// data turu olan toyoto'dan
        //başlayınca böyle bir method bulamadık
        //dolayısıyla CTE


        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket);//Araba
        System.out.println(arb3.hiz);//Araba
        System.out.println(arb3.yakit);//Araba
        System.out.println(arb3.marka);//Araba
        //System.out.println(arb3.sirketMerkezi);// CTE
        //System.out.println(arb3.model);// CTE

        arb3.yakitTuketimi();//Corolla
        arb3.motor();//Corolla
        //arb3.garanti();// CTE aramaya Araba class'ından başladı ve methodu bulamadı
       // arb3.vitesSayisi();//CTE





    }

}
