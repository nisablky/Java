package NİSA.day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        //Soru 12 )
        //Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
        //asagidaki sekli cizdirin
        //*
        //* *
        //* * *
        //* * * *

        int input = 5;
       // int input2 = 8; diktörtgen veya kare için

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                // Neested for Loop ya diktörtgen veya ucgen formatında olabilir
                // diktortgen istediğimizde  iki loop için de bağımsız en point belirleyebiliriz
                // ucgen şekli vermek için inner loop'un end point'ini outer değişken bağlayabiliriz
                System.out.print("* ");

            }
            System.out.println("");
        }


    }
}
