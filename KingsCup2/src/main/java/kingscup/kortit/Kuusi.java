package kingscup.kortit;

import java.util.HashMap;
import kingscup.logiikka.Pelaaja;
import static kingscup.logiikka.Sukupuoli.MIES;

public class Kuusi extends Kortti {

    private HashMap<String, Pelaaja> pelaajat;

    public Kuusi(HashMap<String, Pelaaja> pelaajat) {
        this.pelaajat = pelaajat;
    }

    @Override
    public void suorita() {
        System.out.println("6:");
        System.out.println("Miehet juovat");
        for (String s : pelaajat.keySet()) {
            if (pelaajat.get(s).getSukupoli() == MIES) {
                pelaajat.get(s).juo();
            }
        }
    }

}
