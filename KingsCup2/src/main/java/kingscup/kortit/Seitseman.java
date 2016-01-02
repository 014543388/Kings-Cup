
package kingscup.kortit;

import java.util.HashMap;
import java.util.Scanner;
import kingscup.logiikka.Pelaaja;


public class Seitseman extends Kortti{
    private Pelaaja heavenMaster;
    private Scanner lukija;
    private HashMap<String, Pelaaja> pelaajat;

    public Seitseman(Scanner lukija, HashMap<String, Pelaaja> pelaajat) {
        this.heavenMaster = null;
        this.lukija = lukija;
        this.pelaajat = pelaajat;
    }
    
    

    @Override
    public void suorita() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
