package NİSA.day39_overriding;

public class Araba {

    protected String hareket="Arabalar teker ile hareket eder";
    protected String hiz="Arabalar motor gücüne göre hareket ederler";
    protected String yakit="Arabalar farkli yakıtlar kullanabilir";
    protected String marka="Arabalar üretildikleri markaya sahiiptir";


    public void motor(){
        System.out.println("Arabalar farklı markalarda motor kullanırlar");
    }

    public void yakitTuketimi(){
        System.out.println("Arabalar motor gucu ve yakit türüne göre yakit tüketirler");
    }
}
