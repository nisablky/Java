package NİSA.day27_constructor;

import javax.swing.*;

public class Toyota {
    String marka= "Toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yil;

    public void maxHız(){
        if (yakit.equals("Benzin")){
            System.out.println("Benzinli araçlar max 240 km hız yapar");
        }else if (yakit.equals("Dizel")){
            System.out.println("Dizel araçlar max 260 km hız yapar");
        }

    }

    public void renkTercihleri(){
        if (model.equals("Corolla")){
            System.out.println("Corolla renk seçenekleri kırmızı ve beyaz");
        }else if (model.equals("Yaris")){
            System.out.println("Yaris renk seçenekleri sarı ve lacivert");
        }
    }



}
