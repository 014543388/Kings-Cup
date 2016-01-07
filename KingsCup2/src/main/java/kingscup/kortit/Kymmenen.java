package kingscup.kortit;

import java.util.ArrayList;
import java.util.Scanner;
import kingscup.logiikka.NeverHaveIEver;

public class Kymmenen extends Kortti {

    private Scanner lukija;
    private NeverHaveIEver enolekoskaan;

    public Kymmenen(Scanner lukija) {
        enolekoskaan = new NeverHaveIEver();
        lisaaKysymykset();
        this.lukija = lukija;
    }
    
    public int kysymyksiaJaljella(){
        return this.enolekoskaan.getKysymykset().size();
    }

    private void lisaaKysymykset() {
        enolekoskaan.lisaaKysymys("oppinut uimaan");
        enolekoskaan.lisaaKysymys("omistanut autoa");
        enolekoskaan.lisaaKysymys("omistanut lemmikkiä");
        enolekoskaan.lisaaKysymys("ollut tappelussa");
        enolekoskaan.lisaaKysymys("sammunut liiasta alkoholista");
        enolekoskaan.lisaaKysymys("nähnyt tähdenlentoa");
        enolekoskaan.lisaaKysymys("nähnyt revontulia");
        enolekoskaan.lisaaKysymys("varastanut jotakin");
        enolekoskaan.lisaaKysymys("jättänyt jotakuta");
        enolekoskaan.lisaaKysymys("pelannut jääkiekkoa");
        enolekoskaan.lisaaKysymys("hankkinut ajokorttia");
        enolekoskaan.lisaaKysymys("pelanut Kings Cuppia (tätä kertaa ei lasketa)");
        enolekoskaan.lisaaKysymys("juosssut maratonia");
        enolekoskaan.lisaaKysymys("esiintynyt suurelle yleisölle");
        enolekoskaan.lisaaKysymys("uinut avannossa");
    }

    @Override
    public void suorita() {
        System.out.println("10: ");
        System.out.println("Never-Have-I-Ever (5 kierrosta)");
        if (this.enolekoskaan.getKysymykset().isEmpty()) {
            System.out.println("Kysymykset ovat loppu");
        } else {
            String enter;
            for (int i = 0; i < 5; i++) {
                if (this.enolekoskaan.getKysymykset().isEmpty()) continue;
                System.out.println(enolekoskaan.kysySeuraava());
                enter = lukija.nextLine();
            }
        }

    }

}
