
package kingscup.logiikka;

import java.util.ArrayList;
import java.util.HashMap;
import kingscup.kortit.Kortti;


public class Peli {
    private int juotujaJuomia;
    private Korttipakka pakka;
    private HashMap<String, Pelaaja> pelaajat;
    private Pelaaja qm;

    public Peli(HashMap<Integer, Kortti> kortit, HashMap<String, Pelaaja> pelaajat) {
        juotujaJuomia = 0;
        pakka = new Korttipakka(kortit);
        this.pelaajat = pelaajat;
        qm = null;
    }
    
    
    
    public void run(){
        for(int i = pakka.korttejaYhteensa(); i > 0; i--){
            
        }
    }
    
    public void lisaaJuomia(int juomia){
        juotujaJuomia += juomia;
    }
    
    public void lisaaJuoma(){
        juotujaJuomia++;
    }
    
    
}
