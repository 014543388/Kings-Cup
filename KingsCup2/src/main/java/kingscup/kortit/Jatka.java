
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
        System.out.println("Jätkä:");
        System.out.println("Kategoriat\nNostaja keksii kategorian.\n Jokainen sanoo "
                + "vuoron perään jonkin kyseiseen kategoriaan liittyvän olion.\n "
                + "Ensimmäinen, joka ei keksi uutta, juo.\n Esim. Kategoria: Virvoitusjuomat"
                + " Olioita: Pepsi, Jaffa, Sprite...");
        System.out.print("mokaaja: ");
        String juoja = lukija.nextLine();
        
        while(!pelaajat.containsKey(juoja)){
            System.out.print("pelaaja ei mukana pelissä. Kuka juo? ");
            juoja = lukija.nextLine();
        }
        
        pelaajat.get(juoja).juo();
    }
    
}
