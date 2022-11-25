package NİSA.day29_staticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {

        // başka class'daki static class uyelerine
        // ulasabilmek için sadece clasIsmi.staticUyeIsmi
        // yazmamız yeterlidir


        System.out.println(C01_Static.okulTelefonu);//3122563635

        C01_Static.okulTelefonu = "3125474747";

        System.out.println(C01_Static.okulTelefonu);//3125474747

        // Baska class'daki static olmayan class uyelerine
        // ancak o class'dan obje oluşturarak ulaşabiliriz
        // ve obje ile yapılan atamalar sadece o obje için gecerli olur

        C01_Static obj1 = new C01_Static();
        C01_Static obj2 = new C01_Static();

        System.out.println(obj2.okulIsmi);//Yıldız Koloji
        obj2.okulIsmi="Sabır Koleji";

        System.out.println(obj1.okulIsmi);//Yıldız Koloji



    }
}
