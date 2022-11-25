package NİSA.day27_constructor;

public class Cons02 {
    public static void main(String[] args) {

        //Cons01 obj1= new Cons01();//default constructor devrede
        /* Cons01 class'ında hiç constructor oluşturmazsak,
        Java default constructor ı kullandığından
        obj1'i üretebildik

          Ancak biz parametreli veya parametresiz bir constructor yazdığımızda
          Java default constroctur'ı siler

          Dolayısıyla biz herhangi bir constructor oluşturduğumuzda
          daha önce başka classlar veya kullanıcıların
          oluşturmuş olabileceği objeleri kullanabilmeleri için
          default constructor'ın işlevini gerçekleştirecek
          parametresiz bir constructor oluşturmakta fayda var


         */

        Cons01 obj2= new Cons01("Java");


    }
}
