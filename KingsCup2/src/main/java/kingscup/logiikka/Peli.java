
package kingscup.logiikka;

import java.util.ArrayList;
import java.util.HashMap;
import kingscup.kortit.Kortti;


public class Peli {
    private Korttipakka pakka;
    private HashMap<String, Pelaaja> pelaajat;

    public Peli(Korttipakka pakka, HashMap<String, Pelaaja> pelaajat) {
        this.pakka = pakka;
        this.pelaajat = pelaajat;
    }
    
    
    
    public void pelaa(){
        for(int i = pakka.korttejaYhteensa(); i > 0; i--){
            
        }
    }
    
    
}
