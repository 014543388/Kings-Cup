
package kingscup.kortit;

import java.util.HashMap;
import static kingscup.logiikka.KingsCup.Sukupuoli.MIES;
import static kingscup.logiikka.KingsCup.Sukupuoli.NAINEN;
import kingscup.logiikka.Pelaaja;


public class Kuusi extends Kortti{
    private HashMap<String, Pelaaja> pelaajat;

    public Kuusi(HashMap<String, Pelaaja> pelaajat) {
        this.pelaajat = pelaajat;
    }
    
    

    @Override
    public void suorita() {
        System.out.println("Miehet juovat");
        for(String s : pelaajat.keySet()){
            if(pelaajat.get(s).getSukupoli() == MIES){
                pelaajat.get(s).juo();
            }
        }
    }
    
}
