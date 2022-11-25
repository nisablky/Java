package NİSA.day25_list;

import java.util.ArrayList;
import java.util.List;

public class C03_ListenIstenmeyenElementleriSilme {
    public static void main(String[] args) {
        // verilen bir arrayden istenen elementi(kaçtane varsa) silip kalanları
        // yeni bir array olarak yazdıran bir method oluşturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;

        istenmeyenElementiSilveYazdır(arr,istenmeyenEleman);
    }





















    public static void istenmeyenElementiSilveYazdır(int[] arr, int istenmeyenEleman) {

        List<Integer> yeniList =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != istenmeyenEleman){
                yeniList.add(arr[i]);

            }
        }
        System.out.println(yeniList); // [4, 2, 5, 7, 8, 5, 2, 4]

    }
}
