
package kingscup.logiikka;

import pelilauta.Pelilauta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
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
import static kingscup.logiikka.KingsCup.Sukupuoli.MIES;
import static kingscup.logiikka.KingsCup.Sukupuoli.NAINEN;

public class KingsCup {
    private Scanner lukija = new Scanner(System.in);
    
    public enum Sukupuoli{
        MIES, NAINEN;
    }
    
    public Peli luoPeli(ArrayList<Pelaaja> pelaajat){
        HashMap<String, Pelaaja> pelaajaHash = new HashMap<>();
        for(Pelaaja p : pelaajat){
            pelaajaHash.put(p.getNimi(), p);
        }
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
        
        
        Peli perusPeli = new Peli(new Korttipakka(kortit), pelaajaHash);
        return perusPeli;
    }

    public static void main(String[] args) {
//        Pelilauta lauta = new Pelilauta();
//        
//        lauta.run();
        
        
        
        
        
        
        
        
        
        
        

        
        
        
    }
    
}
