
package kingscup.pelilauta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JTextField;
import kingscup.kortit.Kortti;
import kingscup.logiikka.Korttipakka;

/**
 *
 * @author eamiller
 */
public class KorttinapinKuuntelija implements ActionListener{
    private Korttipakka pakka;
    private int kortinnumero;
    private JTextField teksti;

    public KorttinapinKuuntelija(JTextField teksti, Korttipakka pakka, int kortinnumero) {
        this.teksti = teksti;
        this.pakka = pakka;
        this.kortinnumero = kortinnumero;
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        pakka.nostaKortti(kortinnumero).suorita();
        System.out.println("");
        if(kortinnumero == 13){
            teksti.setText(pakka.getKortit().get(13).toString());
        }
    }
    
}
