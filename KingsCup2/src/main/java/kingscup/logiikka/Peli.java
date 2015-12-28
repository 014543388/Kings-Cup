
package kingscup.logiikka;

import java.util.ArrayList;
import java.util.HashMap;


public class Peli {
    private int juotujaJuomia;
    private Korttipakka pakka;
    private HashMap<String, Pelaaja> pelaajat;
    private Pelaaja qm;

    public Peli() {
        juotujaJuomia = 0;
        
    }
    
    public void run(){
        
    }
    
    public void lisaaJuomia(int juomia){
        juotujaJuomia += juomia;
    }
    
    public void lisaaJuoma(){
        juotujaJuomia++;
    }
    
    
}
