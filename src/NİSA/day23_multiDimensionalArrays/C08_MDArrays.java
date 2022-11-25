package NİSA.day23_multiDimensionalArrays;

public class C08_MDArrays {
    public static void main(String[] args) {

        // soru2 asagıdaki MDA in
        // iç array lerideki son elemanların carpımını
        // ekrana yazdıran bir program yazdırın {{1,2,3,},{4,5,},{6}}

        int arr[][]={{1,2,3,},{4,5,},{6}};
        int carpim=1;

        for (int i = 0; i < arr.length; i++) {
            carpim*=arr[i][arr[i].length-1];


        }
        System.out.println(carpim); //90

    }
}
