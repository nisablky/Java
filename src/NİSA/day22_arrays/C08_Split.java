package NİSA.day22_arrays;

public class C08_Split {
    public static void main(String[] args) {
        // Verilen bir cümlede istenen harfin kaç defa kullanıldığını yazdıran
        // bir method oluşturun

        String cumle = "Nerede o 'hello world' yazdıramayan öğrenciler";
        String harf = "e";

        harfKaçKereKullanımış(cumle, harf);




    }

    private static void harfKaçKereKullanımış(String cumle, String harf) {
        int sayaç=0;

        String karakterler[]= cumle.split("");
        for (int i = 0; i <karakterler.length ; i++) {
            if (karakterler[i].equals(harf)){
                sayaç++;

            }

        }
        System.out.println("Aradığınız " + harf + " verilen cümlede " + sayaç + " adet kullanılmış");
    }
}
