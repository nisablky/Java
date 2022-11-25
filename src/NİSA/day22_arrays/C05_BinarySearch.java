package NİSA.day22_arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {
            // verilen array de istenilen bir elementin var olup olmadığını true yada false olarak gösteren bir method oluşturalım.

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=0;

        istenenElemanVarMi(arr, istenenSayi);

        // eğer javada bunu hazır binarySearch ile yapmak istersek
        // önce sort methodunu kullanıp sonra binarySearch yapmalıyız.









    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {
        boolean sonuc=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==istenenSayi){
                sonuc=true;
                break;
            }
        }
        System.out.println(sonuc);
    }


}
