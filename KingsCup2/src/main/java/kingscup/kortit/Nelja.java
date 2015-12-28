
package kingscup.kortit;

import java.util.HashMap;
import static kingscup.logiikka.KingsCup.Sukupuoli.NAINEN;
import kingscup.logiikka.Pelaaja;


public class Nelja extends Kortti{
    private HashMap<String, Pelaaja> pelaajat;

    public Nelja(HashMap<String, Pelaaja> pelaajat) {
        this.pelaajat = pelaajat;
    }
    
    @Override
    public void suorita() {
        System.out.println("Naiset juovat");
        for(String s : pelaajat.keySet()){
            if(pelaajat.get(s).getSukupoli() == NAINEN){
                pelaajat.get(s).juo();
            }
        }
    }

    
    
}
