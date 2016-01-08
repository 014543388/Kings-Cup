package kingscup.pelilauta;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import kingscup.logiikka.Korttipakka;
import kingscup.logiikka.Pelaaja;

public class Pelilauta implements Runnable {
    private Korttipakka pakka;
    private HashMap<String, Pelaaja> pelaajat;
    private JFrame frame;

    public Pelilauta(Korttipakka pakka, HashMap<String, Pelaaja> pelaajat) {
        this.pakka = pakka;
        this.pelaajat = pelaajat;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Kings Cup");
        frame.setPreferredSize(new Dimension(1200, 500));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(5, 4);
        container.setLayout(layout);
        
        JTextField saannotTekstina = new JTextField("SÄÄNNÖT");
        
        JButton assa = new JButton("Ässä");
        assa.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 1));
        
        JButton kaksi = new JButton("Kaksi");
        kaksi.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 2));
        
        JButton kolme = new JButton("Kolme");
        kolme.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 3));
        
        JButton nelja = new JButton("Neljä");
        nelja.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 4));
        
        JButton viisi = new JButton("Viisi");
        viisi.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 5));
        
        JButton kuusi = new JButton("Kuusi");
        kuusi.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 6));
        
        JButton seitseman = new JButton("Seitsemän");
        seitseman.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 7));
        
        JButton kahdeksan = new JButton("Kahdeksan");
        kahdeksan.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 8));
        
        JButton yhdeksan = new JButton("Yhdeksän");
        yhdeksan.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 9));
        
        JButton kymmenen = new JButton("Kymmenen");
        kymmenen.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 10));
        
        JButton jatka = new JButton("Jätkä");
        jatka.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 11));
        
        JButton kuningatar = new JButton("Kuningatar");
        kuningatar.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 12));
        
        JButton kuningas = new JButton("Kuningas");
        kuningas.addActionListener(new KorttinapinKuuntelija(saannotTekstina,pakka, 13));

            container.add(assa);
            container.add(kaksi);
            container.add(kolme);
            container.add(nelja);
            container.add(viisi);
            container.add(kuusi);
            container.add(seitseman);
            container.add(kahdeksan);
            container.add(yhdeksan);
            container.add(kymmenen);
            container.add(jatka);
            container.add(kuningatar);
            container.add(kuningas);
            
            
            JButton satunnainenKorttiNappi = new JButton("Random kortti");
            satunnainenKorttiNappi.addActionListener(new RandomKorttiNapinKuuntelija(pakka));
            container.add(satunnainenKorttiNappi);
            
            JButton pelaajanappi;
            for(Pelaaja p : pelaajat.values()){
                pelaajanappi = new JButton("Pelaaja: "+p.getNimi());
                pelaajanappi.addActionListener(new PelaajanapinKuuntelija(p));
                container.add(pelaajanappi);
            }
            
            container.add(saannotTekstina);
    }

}
