package kingscup.kortit;

import java.util.HashMap;
import java.util.Scanner;
import kingscup.logiikka.Pelaaja;

public class Kuningatar extends Kortti {

    private Pelaaja questionMaster;
    private Scanner lukija;
    private HashMap<String, Pelaaja> pelaajat;

    public Kuningatar(Scanner lukija, HashMap<String, Pelaaja> pelaajat) {
        this.lukija = lukija;
        this.pelaajat = pelaajat;
        this.questionMaster = null;
    }

    @Override
    public void suorita() {
        System.out.println("Kuningatar:");
        System.out.println("Question master\nNostajasta tulee Question master"
                + " kunnes joku toinen nostaa kuningattaren");
        System.out.print("Question master: ");
        String qm = lukija.nextLine();

        while (!pelaajat.containsKey(qm)) {
            System.out.print("pelaaja ei mukana pelissä. Kenestä QuestionMaster? ");
            qm = lukija.nextLine();
        }

        this.questionMaster = pelaajat.get(qm);
    }

    public Pelaaja getQuestionMaster() {
        return questionMaster;
    }

}
