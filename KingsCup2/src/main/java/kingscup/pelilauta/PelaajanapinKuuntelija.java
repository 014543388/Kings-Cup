package kingscup.pelilauta;

import kingscup.pelaajaikkuna.Pelaajaikkuna;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import kingscup.logiikka.Pelaaja;

/**
 *
 * @author eamiller
 */
public class PelaajanapinKuuntelija implements ActionListener {

    private JTextArea tekstinakyma;
    private Pelaaja pelaaja;

    public PelaajanapinKuuntelija(Pelaaja pelaaja) {
        this.pelaaja = pelaaja;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Pelaajaikkuna ikkuna = new Pelaajaikkuna(pelaaja);
        SwingUtilities.invokeLater(ikkuna);
    }

}
