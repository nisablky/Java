package NİSA.day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan bir sayı alın ve
        // bu sayıyı tam bölen sayılarıve toplam kac tane olduklarını ekrana yazdırın

        int input=20;

        // For loop ilede yapabilriz ama bir
        // while loop ile yapalım


        int bolen=1;
        int sayac=0;

        while(bolen<=input){

            if (input % bolen == 0){
                System.out.print(bolen+ " ");
                sayac++;

            }

            bolen++;

        }
        System.out.println("");
        System.out.println(input + " sayıyı bölen " + sayac + "adet sayı vardır");


    }
}
