
package kingscup.kortit;

import java.util.HashMap;
import java.util.Scanner;
import kingscup.logiikka.Pelaaja;


public class Yhdeksan extends Kortti{
    private Scanner lukija;
    private HashMap<String, Pelaaja> pelaajat;

    public Yhdeksan(Scanner lukija, HashMap<String, Pelaaja> pelaajat) {
        this.lukija = lukija;
        this.pelaajat = pelaajat;
    }
    
    

    @Override
    public void suorita() {
        System.out.println("9:");
        System.out.println("Nine is Rhyme\nNostaja sanoo jonkin sanan. Seuraavan"
                + " on keksittävä riimi tälle sanalle.\n Tämä jatkuu, kunnes"
                + "joku ei riimiä tai jo sanottu sana tulee uudestaan.\n Mokaaja juo.");
        System.out.print("mokaaja: ");
        String juoja = lukija.nextLine();
        while(!pelaajat.containsKey(juoja)){
            System.out.print("pelaaja ei mukana pelissä. Kuka juo? ");
            juoja = lukija.nextLine();
        }
        
        pelaajat.get(juoja).juo();
    }
    
}
