
package kingscup.logiikka;

import java.util.ArrayList;
import static kingscup.logiikka.KingsCup.Sukupuoli.MIES;
import static kingscup.logiikka.KingsCup.Sukupuoli.NAINEN;

public class KingsCup {
    
    public enum Sukupuoli{
        MIES, NAINEN;
    }

    public static void main(String[] args) {
        Pelilauta lauta = new Pelilauta();
        
        lauta.run();
        
        
        Pelaaja evan = new Pelaaja("evan", MIES);
        Pelaaja hoami = new Pelaaja("houmi", NAINEN);
        Pelaaja jaakko = new Pelaaja("jaakko", MIES);
        Pelaaja waltsu = new Pelaaja("waltsu", MIES);
        Pelaaja matias = new Pelaaja("matias", MIES);
        
        System.out.println(evan);
        
        

        
        
        
    }
    
    public void vuoro(){
        
    }
    
}
