package NİSA.day26_forEachLoop_constructor;

public class Araba {
    /*  Java da her class oluşturduğumuzda
        java o class dan ileride objeler üretmek gerekeceğini bilir
        ve biz özellikle belirtmesek de java
        her oluşturduğu class a bir constructor koyar

        Javanın class oluştururken class a koyduğu constructor'a
        DEFAULT CONSTRUCTOR denir ve bu constructor görülmez

        Eğer biz görünür bir constructor'ımız olsun istersek
        Default constructor ile aynı görevi yapan bir constructor yapabiliriz
        veya istersek aynı kalıptan farklı desenlerde objeler olşturmak iiçin
        farklı özelliklerde constructorlarda oluşturabiliriz

        constructor'ları birbirinden farklılaştıran tek ayrıcalık
        kullanılan parametre sayısı ve parametre data türüdür
     */


    public Araba(){
        System.out.println("parametresiz constructor çalıştı");

    }

    /*bir kod bloğunun method veya contructor olmasından emin olmak istiyorsanız
    iki şeye dikkat etmelisiniz
    1- Constructor'ların ismi class ismi ile aynı olmak zorundadır yani büyük harfle başlar,
    2- Constructor'ların return type'i olmaz

    özetle: constructorın adı class adı ile aynı olmalı ve
           return type'i olmamalı


     */

    public Araba(String renk){
        System.out.println( renk + " renkli bir araba üretildi");
    }

    public Araba(int yıl){
        System.out.println(yıl+ " model bir araba üretildi");
    }

    public Araba(int yıl, String renk){
        System.out.println(yıl + " model " + renk + " renginde bir araba üretildi");
    }


}
