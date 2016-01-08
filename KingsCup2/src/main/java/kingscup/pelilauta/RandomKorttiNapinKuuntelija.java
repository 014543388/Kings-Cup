
package kingscup.pelilauta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import kingscup.logiikka.Korttipakka;

/**
 *
 * @author eamiller
 */
public class RandomKorttiNapinKuuntelija implements ActionListener{
    Korttipakka pakka;

    public RandomKorttiNapinKuuntelija(Korttipakka pakka) {
        this.pakka = pakka;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        pakka.nostaSatunnainenKortti().suorita();
        System.out.println("");
        
    }
    
}
