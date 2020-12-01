
package my.TalonHuolto;

import java.util.ArrayList;


public class Huoneisto {
    
    private int huoneiden_lkm;
    private int pinta_ala;
    private Omistaja omistaja;
    
    public Huoneisto(Omistaja omistaja, int huoneita, int pa) {
        this.omistaja = omistaja;
        this.pinta_ala = pa;
        this.huoneiden_lkm = huoneita;
        
    }

    public int getHuoneiden_lkm() {
        return huoneiden_lkm;
    }

    public void setHuoneiden_lkm(int huoneiden_lkm) {
        this.huoneiden_lkm = huoneiden_lkm;
    }

    public double getPinta_ala() {
        return this.pinta_ala;
    }

    public void setPinta_ala(int pinta_ala) {
        this.pinta_ala = pinta_ala;
    }

    public Omistaja getOmistaja() {
        return omistaja;
    }

    public void setOmistaja(Omistaja omistaja) {
        this.omistaja = omistaja;
    }
    
   
    
    
    
    
}
