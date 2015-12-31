
package kingscup.kortit;

import java.util.HashMap;
import java.util.Scanner;
import kingscup.logiikka.Pelaaja;


public class Jatka extends Kortti{
    private Scanner lukija;
    private HashMap<String, Pelaaja> pelaajat;

    public Jatka(Scanner lukija, HashMap<String, Pelaaja> pelaajat) {
        this.lukija = lukija;
        this.pelaajat = pelaajat;
    }
    
    
    @Override
    public void suorita() {
        System.out.println("Kategoriat\nNostaja keksii kategorian. Jokainen sanoo "
                + "vuoron perään jonkin kyseiseen kategoriaan liittyvän olion. "
                + "Ensimmäinen, joka ei keksi uutta, juo. Esim. Kategoria: Virvoitusjuomat"
                + " Olioita: Pepsi, Jaffa, Sprite...");
        System.out.print("mokaaja: ");
        pelaajat.get(lukija.nextLine()).juo();
    }
    
}
