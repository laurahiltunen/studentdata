
package my.TalonHuolto;

import java.util.Random;

public class Tyontekija {
    private String nimi;
    private String firmakoodi;
    
    public Tyontekija(String nimi) {
        this.nimi = nimi;
        this.firmakoodi = luoKoodi();
    }
    
    public String luoKoodi() {
        //arvotaan koodin loppuosan numerot
        Random arpoja = new Random();
        
        String koodi = "AA" + String.valueOf(arpoja.ints(3));
        
        return koodi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getFirmakoodi() {
        return firmakoodi;
    }

    public void setFirmakoodi(String firmakoodi) {
        this.firmakoodi = firmakoodi;
    }
    
   
}
