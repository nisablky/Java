package NİSA.day27_constructor;

public class VolvoRunner {
    public static void main(String[] args) {

        Volvo arb1 = new Volvo();
        System.out.println(arb1.marka);//Volvo
        arb1.yakit= "Dizel";
        arb1.elektirikliMi= false;
        System.out.println(arb1.maxHız);//240

        System.out.println(arb1.toString());//Model : null Yakit : Dizel MaxHız : 240

        Volvo arb2 = new Volvo();
        arb2.yakit="Elektirikli";
        arb2.elektirikliMi=true;
        arb2.model="XC90";
        arb2.maxHız= arb2.maxHızAta();
        System.out.println(arb2.toString());//Model : XC90 Yakit : Elektirikli MaxHız : 160



    }
}
