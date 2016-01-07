
package kingscup.pelaajaikkuna;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import kingscup.logiikka.Pelaaja;


public class Pelaajaikkuna implements Runnable{
    private Pelaaja pelaaja;
    private JFrame frame;

    public Pelaajaikkuna(Pelaaja pelaaja) {
        this.pelaaja = pelaaja;
    }
    
    

    @Override
    public void run() {
        frame = new JFrame("Pelaaja");
        frame.setPreferredSize(new Dimension(300, 200));

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(1, 2);
        container.setLayout(layout);
        
        container.add(new JTextArea(pelaaja.toString()));
        JButton juoNappi = new JButton("juo");
        ActionListener juomanapinKuuntelija = new JuomanapinKuuntelija(pelaaja);
        juoNappi.addActionListener(juomanapinKuuntelija);
        
        container.add(juoNappi);
    }
    
}
