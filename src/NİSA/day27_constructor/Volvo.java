package NİSA.day27_constructor;

public class Volvo {

    String marka= "Volvo";
    String mensei="Isvec";
    String model;
    boolean elektirikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot=otomatikPilotSorgusu();
    int maxHız=maxHızAta();

    public Volvo(String mdl, boolean elk , int yl, String ykt) {

        model= mdl;
        elektirikliMi= elk;
        yil= yl;
        yakit= ykt;
        maxHız=maxHızAta();
        otomatikPilot=otomatikPilotSorgusu();

    }

    public Volvo(){

    }



    public int maxHızAta() {
        int maxHız=0;
        if (elektirikliMi){
            maxHız=160;
        }else{
            maxHız=240;
        }
        return maxHız;
    }





    public boolean otomatikPilotSorgusu() {
        boolean sonuc=false;

         if (elektirikliMi){
            sonuc= true;

         }
         return sonuc;
    }

    public String toString(){
        String arabaOzellikleri= "Model : " + model +
                                  " Yakit : " + yakit +
                                  " MaxHız : " + maxHız;

        return arabaOzellikleri;
    }



}
