package NİSA.day33_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        // verilen kaç tane string verilirse verilsin
        // içlerinden en uzun  olanı yazdıran bir method oluşturun
        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";


        //yazılan ergument sayısı sabitse herzaman ki gibi bir method oluşturabiliriz
        //ancak ergument sayısının değişme ihtimali varsa
        //o zaman varargs tercih edilir
        enUzunKelime(str1,str2,str3);

    }

    private static void enUzunKelime(String... str) {

        String enUzunStr="";

        for (String each:str
             ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }
            
        }
        System.out.println("en uzun kelime : " + enUzunStr);//Oguzhan
    }
}
