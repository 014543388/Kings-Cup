
package kingscup.kortit;

import java.util.HashMap;
import java.util.Scanner;
import kingscup.logiikka.Pelaaja;


public class Kahdeksan extends Kortti{
    private HashMap<String, Pelaaja> pelaajat;
    private Scanner lukija;

    public Kahdeksan(HashMap<String, Pelaaja> pelaajat, Scanner lukija) {
        this.pelaajat = pelaajat;
        this.lukija = lukija;
    }
    
    @Override
    public void suorita() {
        System.out.println("Eight is Mate\nNostaja valitsee itselleen kaverin. Kaveria ei jätetä!");
        System.out.print("Nostaja: ");
        String nostaja = lukija.nextLine();
        System.out.println("Kaveri: ");
        String kaveri = lukija.nextLine();
        
        pelaajat.get(nostaja).newMate(pelaajat.get(kaveri));
    }
    
}
