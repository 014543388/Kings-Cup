
package kingscup.kortit;

import java.util.HashMap;
import java.util.Scanner;
import kingscup.logiikka.Pelaaja;


public class Kaksi extends Kortti{
    private Scanner lukija;
    private HashMap<String, Pelaaja> pelaajat;

    public Kaksi(Scanner lukija, HashMap<String, Pelaaja> pelaajat) {
        this.lukija = lukija;
        this.pelaajat = pelaajat;
    }
    
    
    @Override
    public void suorita() {
        String juoja;
        System.out.println("2 is you");
        do{
            System.out.print("Kuka juo: ");
            juoja = lukija.nextLine();
        }while(!pelaajat.containsKey(juoja));
        
        pelaajat.get(juoja).juo();
    }

    
    
}
