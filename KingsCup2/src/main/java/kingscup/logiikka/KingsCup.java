
package kingscup.logiikka;

import pelilauta.Pelilauta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import kingscup.kortit.Assa;
import kingscup.kortit.Kaksi;
import kingscup.kortit.Kolme;
import kingscup.kortit.Kortti;
import kingscup.kortit.Nelja;
import static kingscup.logiikka.KingsCup.Sukupuoli.MIES;
import static kingscup.logiikka.KingsCup.Sukupuoli.NAINEN;

public class KingsCup {
    Scanner lukija = new Scanner(System.in);
    
    public enum Sukupuoli{
        MIES, NAINEN;
    }
    
    public Peli perusPeli(ArrayList<Pelaaja> pelaajat){
        HashMap<String, Pelaaja> pelaajaHash = new HashMap<>();
        for(Pelaaja p : pelaajat){
            pelaajaHash.put(p.getNimi(), p);
        }
        HashMap<Integer, Kortti> kortit = new HashMap<>();
        kortit.put(1, new Assa());
        kortit.put(2, new Kaksi(lukija, pelaajaHash));
        kortit.put(3, new Kolme(lukija, pelaajaHash));
        kortit.put(4, new Nelja(pelaajaHash));
        
        Peli perusPeli = new Peli(kortit, pelaajaHash);
        return perusPeli;
    }

    public static void main(String[] args) {
//        Pelilauta lauta = new Pelilauta();
//        
//        lauta.run();
        Random random = new Random();
        System.out.println(random.nextInt(2)+1);
        
        
        
        
        
        
        

        
        
        
    }
    
    public void vuoro(){
        
    }
    
}
