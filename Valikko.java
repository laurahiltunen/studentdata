
package my.TalonHuolto;

import java.util.ArrayList;

public class Valikko {
    
    private ArrayList<Omistaja> omistajat;
    private Huoltoyhtio huoltoyhtio;
    private Tyontekijarekisteri rekisteri;
    private Rivitalo rivari;
    
    public Valikko() {
        this.omistajat = new ArrayList<Omistaja>();
        this.rekisteri = new Tyontekijarekisteri();
        this.huoltoyhtio = new Huoltoyhtio(rekisteri);
        this.rivari = new Rivitalo();
        luohenkilot();
        
        
    }
    
    public void luohenkilot() {
        Omistaja omistaja1 = new Omistaja("Kalle Koiranen");
        Omistaja omistaja2 = new Omistaja("Kille Kissanen");
        Omistaja omistaja3 = new Omistaja("Perttu Sukkanen");
       
        omistajat.add(omistaja1);
        omistajat.add(omistaja2);
        omistajat.add(omistaja3);
        
        Tyontekija tyontekija1 = new Tyontekija("Tiina Soikio");
        Tyontekija tyontekija2 = new Tyontekija("Miki Nenänen");
        Tyontekija tyontekija3 = new Tyontekija("Tepa Tuppura");
        Tyontekija tyontekija4 = new Tyontekija("Minni Topakka");
        Tyontekija tyontekija5 = new Tyontekija("Eeli Ratavuo");
        Tyontekija tyontekija6 = new Tyontekija("Sara Sirri");
        Tyontekija tyontekija7 = new Tyontekija("Tuukka Lapanen");
        
        rekisteri.lisaaTyontekija(tyontekija1);
        rekisteri.lisaaTyontekija(tyontekija2);
        rekisteri.lisaaTyontekija(tyontekija3);
        rekisteri.lisaaTyontekija(tyontekija4);
        rekisteri.lisaaTyontekija(tyontekija5);
        rekisteri.lisaaTyontekija(tyontekija6);
        rekisteri.lisaaTyontekija(tyontekija7);
        
        rivari.lisaaHuoneisto(new Huoneisto(omistaja1, 3, 85));
        rivari.lisaaHuoneisto(new Huoneisto(omistaja2, 6, 120));
        rivari.lisaaHuoneisto(new Huoneisto(omistaja3, 4, 99));
        
    }
    
    public void lisaaRekisteriin(Tyontekija tyontekija) {
        rekisteri.lisaaTyontekija(tyontekija);
    }
    
    public void postaRekisterista(Tyontekija tyontekija) {
        rekisteri.poistaTyontekija(tyontekija);
    }
    
    public ArrayList<Tyontekija> palautaTyontekijalista() {
        return rekisteri.palautaTyontekijat();
    }
    
    public void lisaaHuoneisto(Huoneisto huoneisto) {
        rivari.lisaaHuoneisto(huoneisto);
    }
    
    public void poistaHuoneisto(Huoneisto huoneisto) {
        rivari.poistaHuoneisto(huoneisto);
    }
    
    public Tyontekija palautaHenkilo(String hakusana) {
        return rekisteri.palautaTyontekija(hakusana);
    }
    
    public void lisaaOmistaja(Omistaja omistaja) {
        omistajat.add(omistaja);
    }
    
    public Rivitalo rivitalonHuoneistot() {
        return rivari;
    }
    
    public Huoneisto palautaHuoneisto(int huoneet, int pa, Omistaja omistaja) {
        return rivari.palautaHuoneisto(huoneet, pa, omistaja);
    }
    
   
}
