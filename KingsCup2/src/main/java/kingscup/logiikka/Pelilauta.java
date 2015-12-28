package kingscup.logiikka;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Pelilauta implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Kings Cup");
        frame.setPreferredSize(new Dimension(1200, 700));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.X_AXIS);
        container.setLayout(layout);

        container.add(new JButton("Eka!"));
        container.add(new JLabel("Toka!"));
        container.add(new JLabel("Kolmas!"));

        layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Eka!"));
        container.add(new JLabel("Toka!"));
        container.add(new JLabel("Kolmas!"));
    }

}
