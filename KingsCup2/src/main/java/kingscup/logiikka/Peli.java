
package kingscup.logiikka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import kingscup.kortit.Kortti;


public class Peli {
    private Scanner lukija;
    private Korttipakka pakka;
    private HashMap<String, Pelaaja> pelaajat;

    public Peli(Scanner lukija, Korttipakka pakka) {
        this.lukija = lukija;
        this.pakka = pakka;
        this.pelaajat = new HashMap<>();
    }
    
    
    
    public void aloitaPeli(){
        System.out.println("Ketkä pelaavat? (1 lopettaa)");
        while(true){
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            System.out.println("Sukupuoli (m/n): ");
            String sukupuoli = lukija.nextLine();
        }
    }
    
    
}
