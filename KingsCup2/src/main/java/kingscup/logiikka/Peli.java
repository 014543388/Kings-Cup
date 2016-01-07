package kingscup.logiikka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import kingscup.kortit.Assa;
import kingscup.kortit.Jatka;
import kingscup.kortit.Kahdeksan;
import kingscup.kortit.Kaksi;
import kingscup.kortit.Kolme;
import kingscup.kortit.Kortti;
import kingscup.kortit.Kuningas;
import kingscup.kortit.Kuningatar;
import kingscup.kortit.Kuusi;
import kingscup.kortit.Kymmenen;
import kingscup.kortit.Nelja;
import kingscup.kortit.Seitseman;
import kingscup.kortit.Viisi;
import kingscup.kortit.Yhdeksan;
import static kingscup.logiikka.Sukupuoli.MIES;
import static kingscup.logiikka.Sukupuoli.NAINEN;
import kingscup.pelilauta.Pelilauta;

public class Peli {

    private Scanner lukija;
    private Korttipakka pakka;
    private HashMap<String, Pelaaja> pelaajat;

    public Peli(Scanner lukija) {
        this.lukija = lukija;
        this.pelaajat = new HashMap<>();
    }
    
    private Korttipakka luoKorttipakka(HashMap<String, Pelaaja> pelaajaHash){
        HashMap<Integer, Kortti> kortit = new HashMap<>();
        kortit.put(1, new Assa(lukija));
        kortit.put(2, new Kaksi(lukija, pelaajaHash));
        kortit.put(3, new Kolme(lukija, pelaajaHash));
        kortit.put(4, new Nelja(pelaajaHash));
        kortit.put(4, new Nelja(pelaajaHash));
        kortit.put(5, new Viisi(lukija, pelaajaHash));
        kortit.put(6, new Kuusi(pelaajaHash));
        kortit.put(7, new Seitseman(lukija, pelaajaHash));
        kortit.put(8, new Kahdeksan(lukija, pelaajaHash));
        kortit.put(9, new Yhdeksan(lukija, pelaajaHash));
        kortit.put(10, new Kymmenen(lukija));
        kortit.put(11, new Jatka(lukija, pelaajaHash));
        kortit.put(12, new Kuningatar(lukija, pelaajaHash));
        kortit.put(13, new Kuningas(lukija));
        
        return new Korttipakka(kortit);
    }

    public void aloitaPeli() {
        System.out.println("Ketkä pelaavat? (Enter aloittaa pelin)");

        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                System.out.println("");
                break;
            }

            System.out.print("Sukupuoli (m/n): ");
            String sukupuoli = lukija.nextLine();
            if (sukupuoli.startsWith("m")) {
                this.pelaajat.put(nimi, new Pelaaja(nimi, MIES));
            } else if (sukupuoli.startsWith("n")) {
                this.pelaajat.put(nimi, new Pelaaja(nimi, NAINEN));
            }
            System.out.println("");
        }
        
        this.pakka = luoKorttipakka(pelaajat);
        Pelilauta lauta = new Pelilauta(pakka, pelaajat);
        
        SwingUtilities.invokeLater(lauta);

        
        
    }

}
