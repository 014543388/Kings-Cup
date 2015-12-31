
package kingscup.kortit;

import java.util.HashMap;
import java.util.Scanner;
import kingscup.logiikka.Pelaaja;


public class Kuningatar extends Kortti{
    private Pelaaja questionMaster;
    private Scanner lukija;
    private HashMap<String, Pelaaja> pelaajat;

    public Kuningatar(Scanner lukija, HashMap<String, Pelaaja> pelaajat) {
        this.lukija = lukija;
        this.pelaajat = pelaajat;
    }

    @Override
    public void suorita() {
        System.out.println("Question master\nNostajasta tulee Question master"
                + " kunnes joku toinen nostaa kuningattaren");
        System.out.print("Question master: ");
        this.questionMaster = pelaajat.get(lukija.nextLine());
    }

    public Pelaaja getQuestionMaster() {
        return questionMaster;
    }
    
    
    
    
}
