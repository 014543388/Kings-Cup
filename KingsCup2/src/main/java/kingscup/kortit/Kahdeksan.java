package kingscup.kortit;

import java.util.HashMap;
import java.util.Scanner;
import kingscup.logiikka.Pelaaja;

public class Kahdeksan extends Kortti {

    private HashMap<String, Pelaaja> pelaajat;
    private Scanner lukija;

    public Kahdeksan(Scanner lukija, HashMap<String, Pelaaja> pelaajat) {
        this.pelaajat = pelaajat;
        this.lukija = lukija;
    }

    @Override
    public void suorita() {
        System.out.println("8:");
        System.out.println("Eight is Mate\nNostaja valitsee itselleen kaverin. Kaveria ei jätetä!");
        System.out.print("Nostaja: ");
        String nostaja = lukija.nextLine();
        System.out.print("Kaveri: ");
        String kaveri = lukija.nextLine();

        while (true) {
            while (!this.pelaajat.containsKey(nostaja) || !this.pelaajat.containsKey(kaveri)) {
                System.out.println("Ainakin yksi annetuista nimistä ei ole pelissä mukana. Uudestaan.");
                System.out.print("Nostaja: ");
                nostaja = lukija.nextLine();
                System.out.print("Kaveri: ");
                kaveri = lukija.nextLine();
            }
            if (pelaajat.get(nostaja).getMates().contains(pelaajat.get(kaveri))) {
                System.out.println("Kaveriyhteys on jo olemassa. Uudestaan");
                System.out.print("Nostaja: ");
                nostaja = lukija.nextLine();
                System.out.print("Kaveri: ");
                kaveri = lukija.nextLine();
            } else {
                break;
            }
        }

        pelaajat.get(nostaja).newMate(pelaajat.get(kaveri));
    }

}
