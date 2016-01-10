package kingscup.kortit;

import java.util.HashMap;
import java.util.Scanner;
import kingscup.logiikka.Pelaaja;

public class Kolme extends Kortti {

    private Scanner lukija;
    private HashMap<String, Pelaaja> pelaajat;

    public Kolme(Scanner lukija, HashMap<String, Pelaaja> pelaajat) {
        this.lukija = lukija;
        this.pelaajat = pelaajat;
    }

    @Override
    public void suorita() {
        System.out.println("3 is me");
        System.out.print("Kenen vuoro?");
        String juoja = lukija.nextLine();

        while (!pelaajat.containsKey(juoja)) {
            System.out.print("pelaaja ei mukana pelissä. Kuka juo? ");
            juoja = lukija.nextLine();
        }

        pelaajat.get(juoja).juo();
    }

}
