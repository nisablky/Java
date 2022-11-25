package NİSA.day17_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {

        int sayi=60;
        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0 && i%5==0) {
                System.out.print("Java Guzeldir ");
            } else if(i%3==0){
                System.out.print("Java ");
            } else if(i%5==0){
                System.out.print("Guzeldir ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
