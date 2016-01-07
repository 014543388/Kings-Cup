
package kingscup.pelaajaikkuna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import kingscup.logiikka.Pelaaja;

/**
 *
 * @author eamiller
 */
public class JuomanapinKuuntelija implements ActionListener{
    private Pelaaja pelaaja;

    public JuomanapinKuuntelija(Pelaaja pelaaja) {
        this.pelaaja = pelaaja;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.pelaaja.juo();
    }
    
}
