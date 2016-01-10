package kingscup.logiikka;

import java.util.Scanner;

public class KingsCup {

    private static Scanner lukija = new Scanner(System.in);

    /**
     * Ohjelman main-metodi.
     * Luo ja käynnistää pelin
     */
    public static void main(String[] args) {

        Peli peli = new Peli(lukija);
        peli.aloitaPeli();
    }
    
    

}
