package NİSA.day27_constructor;

public class Z {
    String ısım;
    String soyısım;
    int numara;
    boolean gercekMi;


    public Z(String ısm, String soyısm, int no, boolean grc) {

        ısım=ısm;
        soyısım=soyısm;
        numara= no;
        gercekMi= grc;


    }

    public Z(String ısım, String soyısım, int numara) {
        this.ısım=ısım;
        this.soyısım=soyısım;
        this.numara= numara;

    }

    public String toString(){

        return ("Isım : " + ısım + ", Soyısım : " + soyısım+ ", Numara : " + numara);
    }
}
