
package my.TalonHuolto;

import java.util.ArrayList;


public class Rivitalo {
    private ArrayList<Huoneisto> huoneistot;
    
    public Rivitalo() {
        this.huoneistot = new ArrayList<Huoneisto>();
    }
    
    public void lisaaHuoneisto(Huoneisto huoneisto){
        //lisätään työntekijä listalle
        huoneistot.add(huoneisto);
        
    }
    
    public void poistaHuoneisto(Huoneisto huoneisto){
        //lisätään työntekijä listalle
        huoneistot.remove(huoneisto);
        
    }

    public ArrayList<Huoneisto> getHuoneistot() {
        return huoneistot;
    }

    public void setHuoneistot(ArrayList<Huoneisto> huoneistot) {
        this.huoneistot = huoneistot;
    }
    
    
    
    
    public Huoneisto palautaHuoneisto(int huoneet, int pa, Omistaja omistaja) {
        
        //etsitään haettava työntekijä listalta ja palutetaan oliona
        int haettu = 0;
       
        for(int i = 0; i < huoneistot.size(); i++) {
            
            if(huoneistot.get(i).getHuoneiden_lkm() == huoneet && huoneistot.get(i).getPinta_ala() == pa && huoneistot.get(i).getOmistaja().getNimi() == omistaja.getNimi() ) {
                
                haettu = i;
            }
            
        };
        
        return huoneistot.get(haettu);
        
    }
}
