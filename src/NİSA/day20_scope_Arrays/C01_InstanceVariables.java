package NİSA.day20_scope_Arrays;

public class C01_InstanceVariables {


    public int sayi;
    public String bransIsmi="Java";
    public boolean okuldaMi;



    public static void main(String[] args) {

        // sayi=10;  sayi variablesi static olmadığından için main methoddan direk kullanılmaz
        // instance variable lara static methodlardan ulaşabilöek için obje oluşturmamız gerekir


        C01_InstanceVariables obj1 = new C01_InstanceVariables();
        System.out.println(obj1.sayi); // 0
        obj1.sayi=10;
        System.out.println(obj1.sayi); // 10
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okuldaMi); // false


        C01_InstanceVariables obj2=new C01_InstanceVariables();
        System.out.println(obj2.sayi); // 0
        System.out.println(obj2.bransIsmi); // Java


        obj1.okuldaMi=true;

        System.out.println(obj2.okuldaMi); //false
        System.out.println(obj1.okuldaMi); //true







    }
}
