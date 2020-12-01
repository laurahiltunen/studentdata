
package my.TalonHuolto;


public class EUmaa implements Liittymisvuosi{
    
    public int liittymisvuosi;
    public String nimi;
    
    public EUmaa(String nimi, int liittymisvuosi) {
        this.nimi = nimi;
        this.liittymisvuosi = liittymisvuosi;
        
    }
    
    
    public int palautaLiittymisvuosi() {
        return this.liittymisvuosi;
    }
    
    
}
