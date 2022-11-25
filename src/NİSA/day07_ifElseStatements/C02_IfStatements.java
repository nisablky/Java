package NİSA.day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;


        if (a < b && b < 100) {

            System.out.println("isteğiniz gercekleşecek");

        }

        if (a > 0) System.out.println("süslü parantez olmaz ise bir satır çalışır");

        System.out.println("2. satır da çalıştı");

        // bir if cumlesinin daha anlasilir olmasini istiyorsaniz
        // if body'sini {} icine yazmalisiniz
        // body'yi {} icine yazmazsak da if cumlesi calisir
        // ancak ilk ; gordugunde if cumlesi bitmis olur
        // 24.satirdaki kod 15.satirdaki if dogru olsada calisir false olsa da calisir


    }


}

