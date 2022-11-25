package NİSA.day38_inheritance_overriding;

public class Isci extends Personel {

    public String satatu="Isci";
    public String haklar= "Isciler kidem tazminatı alırlar";
    public String ikramiye="Isciler yılda bir ikremiye alır";

    public void mesai(){
        System.out.println("Tum isciler haftalık 40 saat çalışır");
    }


    public void maasHesapla(){
        System.out.println("Tum isciler 30 gun * 8 saat * 11 euro = " + (30*8*11) + " Euro maas alır.");
    }
}
