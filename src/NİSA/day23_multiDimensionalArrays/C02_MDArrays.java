package NİSA.day23_multiDimensionalArrays;

public class C02_MDArrays {
    public static void main(String[] args) {


        // verilen MDA array in tüm elemntlerin toplamını bulunuz

        int arr [][]= {{3,1,7},{6,2,10}};
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];

            }

        }
        System.out.println("arraydeki elementlerin toplamı : " + toplam); //29

    }
}
