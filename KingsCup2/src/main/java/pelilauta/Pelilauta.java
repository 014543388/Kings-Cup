package pelilauta;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
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
        GridLayout layout = new GridLayout(4, 4);
        container.setLayout(layout);

            container.add(new JButton("Ässä"));
            container.add(new JButton("Kksi"));
            container.add(new JButton("Kolme"));
            container.add(new JButton("Nelkku"));
            container.add(new JButton("Viisi"));
            container.add(new JButton("Kuusi"));
            container.add(new JButton("Seitsemän"));
            container.add(new JButton("Kahdeksan"));
            container.add(new JButton("Yhdeksän"));
            container.add(new JButton("Kymmenen"));
            container.add(new JButton("Jätkä"));
            container.add(new JButton("Kuningatar"));
            container.add(new JButton("Kuningas"));
    }

}
