package NİSA.day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=0;
        // eğer javada bunu hazır binarySearch ile yapmak istersek
        // önce sort methodunu kullanıp sonra binarySearch yapmalıyız.
        // binarySearch() bize istenen sayının olduğu indexi verir



        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr,istenenSayi));// bize istediğimiz indexin elemanını verir


        //eğer olmayan bir elementi aratırsak
        //java bulamadığını göstermek için - işaretini koyardı.
        // sonrasında o sayı olsaydı siralaması ne olacak ise o sırayı bize verir



    }
}
