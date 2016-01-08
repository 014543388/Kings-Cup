
package kingscup.pelaajaikkuna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import kingscup.logiikka.Pelaaja;

/**
 *
 * @author eamiller
 */
public class JuomanapinKuuntelija implements ActionListener{
    private Pelaaja pelaaja;
    private JTextArea teksti;

    public JuomanapinKuuntelija(Pelaaja pelaaja, JTextArea teksti) {
        this.teksti = teksti;
        this.pelaaja = pelaaja;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.pelaaja.juo();
        this.teksti.setText(pelaaja.toString());
    }
    
}
