
package kingscup.pelilauta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import kingscup.logiikka.Korttipakka;

/**
 *
 * @author eamiller
 */
public class RandomNapinKuuntelija implements ActionListener{
    Korttipakka pakka;

    public RandomNapinKuuntelija(Korttipakka pakka) {
        this.pakka = pakka;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        pakka.nostaSatunnainenKortti().suorita();
        System.out.println("");
        
    }
    
}
