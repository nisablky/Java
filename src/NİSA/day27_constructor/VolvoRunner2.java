package NİSA.day27_constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
        //Her objeobje oluşturduğumuzda model, yakit gibi değerleri tek tek
        // atama yapmak istemiyorsanız

        Volvo arb1= new Volvo("XC60",false,2023,"Benzin");
        System.out.println(arb1);//Model : XC60 Yakit : Benzin MaxHız : 240

        Volvo arb2= new Volvo("XC90",true,2021,"Elektirikli" );
        System.out.println(arb2);//Model : XC90 Yakit : Elektirikli MaxHız : 160


    }
}
