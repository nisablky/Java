package NİSA.day05_matematikselIslemler;

public class C01_PreIncrementPostIncrement {

    public static void main(String[] args) {

        int sayı=10;
        // bu sayıyı bir arttırmak isterssek

        sayı++;
        System.out.println(sayı);// 11

        sayı++;
        System.out.println(sayı);// 12
        // eğer 10. ve 13 satırda yaptığımız 2 iki işlemi tek satırda yaparsam
        // java iki işlemde önce hangisini yapacağını bilmek ister
        // önce arttırır sonra yazdırırsak java yeni depğer yazar
        // ama önce yazdırır sonra arttırırsak bu durumda eski değer yaılır

        System.out.println("Pre-increment satırında  " + ++sayı); //13 // önce arttırır sonra yazdır
        System.out.println("Pre-incrementden sonra  " + sayı); //13

        System.out.println("post-increment satırında  "+ sayı++); // 13 önce yazdırır
        System.out.println("post-incremenden sonra  "+ sayı); //14




    }
}
