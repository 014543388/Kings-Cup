
package kingscup.pelilauta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import kingscup.kortit.Kortti;
import kingscup.logiikka.Korttipakka;

/**
 *
 * @author eamiller
 */
public class KorttinapinKuuntelija implements ActionListener{
    private Korttipakka pakka;
    private int kortinnumero;

    public KorttinapinKuuntelija(Korttipakka pakka, int kortinnumero) {
        this.pakka = pakka;
        this.kortinnumero = kortinnumero;
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        pakka.nostaKortti(kortinnumero).suorita();
        System.out.println("");
    }
    
}
