package NİSA.day02_variables;

public class C03_Variables {
    public static void main(String[] args) {
        String ogrenciİsmi= "Melih";

        ogrenciİsmi="Furkan";

        // Bir variable Declare edildikten sonra istediğimiz kadar değer depğişimi yapabiliriz
        // ancak declare edilen bir veriable tekrar declare edilemez

        //String ogrenciİsmi="Abdullah";

        String isim,soyisim,dogumyeri;

        isim="Nihat";
        soyisim="ozel";
        dogumyeri="Ankara";

        System.out.println(dogumyeri);
        System.out.println(soyisim);


        String tcNo="12345678901";

        String hiclik="";

        // String non-primiteve olduğu biz sadece data saklamak değil
        // ekstra bazı özelliklerinide kullana biliyoruz
        // eğer okul numarası veya telefon gibi
        // kendisi sayısal olan ancak matematıksel işlemde kullanılmayan
        // değerler içinde String kullanabiliriz


        String harf="A";
        char harf2='A';

        // bu ikisi içinse aynı durum geçerli
        // ben A harfı için variable char olarakda oluştara bilirim String olarakta oluştara bilirim
        // eğer sadece saklayacaksak char olarak saklaya biliriz
        // ama String in özelliklerinde istifade etmek için String olarak tanımlamak daha avantajlı olabilir.

    }
}
