
package kingscup.kortit;

import java.util.HashMap;
import kingscup.logiikka.Pelaaja;
import static kingscup.logiikka.Sukupuoli.NAINEN;


public class Nelja extends Kortti{
    private HashMap<String, Pelaaja> pelaajat;

    public Nelja(HashMap<String, Pelaaja> pelaajat) {
        this.pelaajat = pelaajat;
    }
    
    @Override
    public void suorita() {
        System.out.println("4:");
        System.out.println("Naiset juovat");
        for(String s : pelaajat.keySet()){
            if(pelaajat.get(s).getSukupoli() == NAINEN){
                pelaajat.get(s).juo();
            }
        }
    }

    
    
}
