package NİSA.day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {

        boolean doğruMu= true;
        // String str= dogruMu; Sol String sağ boolen olunca kabul etmiyor


        byte sayı1= 44;
        System.out.println(sayı1);


        short sayı2 = sayı1; // eşitliğin solu short sağı byte olmasına rağmen java itiraz etmiyor

        System.out.println(sayı2= sayı1);
        //  değer olarak atanan data türü variable data türünden küçük olduğu için java sorun yapmaz



        double sayı3=sayı2 ;
        System.out.println(sayı3=sayı2);

    }
}
