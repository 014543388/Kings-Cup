
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
        System.out.println("7 is Heaven. Nostajasta tulee HeavenMaster. kun HM nostaa"
                + "kätensä ilmaan, viimeinen kätensä ilmaan nostanut juo. Kertakäyttöinen. "
                + "Valta katoaa seuraavan 7 ilmaantuessa");
        System.out.print("HeavenMaster: ");
        String pelaajanNimi = lukija.nextLine();
        while(!pelaajat.containsKey(pelaajanNimi)){
            System.out.print("Pelaaja ei mukana pelissä. HeavenMaster? ");
            pelaajanNimi = lukija.nextLine();
        }
        
        this.heavenMaster = pelaajat.get(pelaajanNimi);
    }

    public Pelaaja getHeavenMaster() {
        return heavenMaster;
    }
    
    
    
}
