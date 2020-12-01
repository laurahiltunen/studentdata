
package my.TalonHuolto;

import java.util.ArrayList;


public class Tyontekijarekisteri {
    
    private  ArrayList<Tyontekija> tyontekijat;
    
    public Tyontekijarekisteri() {
        this.tyontekijat = new ArrayList<Tyontekija>();
    }
    
    public void lisaaTyontekija(Tyontekija tyontekija){
        //lisätään työntekijä listalle
        tyontekijat.add(tyontekija);
        
    }
    
    public void poistaTyontekija(Tyontekija tyontekija){
        //poistetaan työntekijä listalta
        tyontekijat.remove(tyontekija);
    }
    
    public Tyontekija palautaTyontekija(String hakusana) {
        
        //etsitään haettava työntekijä listalta ja palutetaan oliona
        int haettu = 0;
       
        for(int i = 0; i < tyontekijat.size(); i++) {
            
            if(tyontekijat.get(i).getNimi().contains(hakusana)) {
                
                haettu = i;
            }
            
        };
        
        return tyontekijat.get(haettu);
        
    }
    
    public ArrayList<Tyontekija> palautaTyontekijat() {
        return this.tyontekijat;
    }
    
}
