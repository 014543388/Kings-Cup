package kingscup.logiikka;

import kingscup.kortit.Kortti;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import kingscup.kortit.Loppukortti;

public class Korttipakka {

    private Scanner lukija;
    private HashMap<Integer, Integer> korttienMaarat;
    private HashMap<Integer, Kortti> kortit;
    private Random random;

    public Korttipakka(HashMap<Integer, Kortti> kortit) {
        this.kortit = kortit;
        korttienMaarat = new HashMap<>();
        pakanLisays();
        random = new Random();
    }

    /**
     * Lisää virtuaaliseen korttipakkaan yhden pakan verran kortteja
     */
    private void pakanLisays() {
        for (int i = 1; i < kortit.keySet().size() + 1; i++) {
            if (korttienMaarat.containsKey(i)) {
                korttienMaarat.put(i, korttienMaarat.get(i) + 4);
            } else {
                korttienMaarat.put(i, 4);
            }
        }
    }

    /**
     * Poistaa ja palauttaa pakasta satunnaisen kortin
     *
     * @return jokin pakassa olave kortti
     */
    public Kortti nostaSatunnainenKortti() {
        if (korttejaYhteensa() == 0) {
            return null;
        }
        int eriKortteja = kortit.keySet().size();
        int kortinNumero = random.nextInt(eriKortteja) + 1;
        while (korttienMaarat.get(kortinNumero) == 0) {
            kortinNumero = random.nextInt(eriKortteja) + 1;
        }
        korttienMaarat.put(kortinNumero, korttienMaarat.get(kortinNumero) - 1);

        return kortit.get(kortinNumero);
    }

    /**
     * Poistaa ja palauttaa pakasta tietyn kortin. Palauttaa null, jos kyseinen
     * kortti on loppunut pakasta, tai jos parametri ei ole mahdollinen kortin
     * arvo.
     *
     * @param numero (välillä 1-13)
     * @return annettua numeroa vastaava kortti
     */
    public Kortti nostaKortti(int i) {
        if (i < 1 || i > kortit.keySet().size()) {
            return null;
        }
        if (korttienMaarat.get(i) == 0) {
            return new Loppukortti();
        }
        korttienMaarat.put(i, korttienMaarat.get(i) - 1);
        return kortit.get(i);
    }

    /**
     * @return pakassa tällä hetkellä olevien korttien määrä
     */
    public int korttejaYhteensa() {
        int kortteja = 0;
        for (int i : korttienMaarat.keySet()) {
            kortteja += korttienMaarat.get(i);
        }
        return kortteja;
    }

    public HashMap<Integer, Integer> getKorttienMaarat() {
        return korttienMaarat;
    }

    public HashMap<Integer, Kortti> getKortit() {
        return kortit;
    }

}
