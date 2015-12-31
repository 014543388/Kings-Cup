
package kingscup.kortit;

import java.util.ArrayList;
import java.util.Scanner;


public class Kymmenen extends Kortti{
    private Scanner lukija;
    private ArrayList<String> saannot = new ArrayList<>();

    public Kymmenen(Scanner lukija) {
        this.lukija = lukija;
    }

    @Override
    public void suorita() {
        System.out.println("Nostaja keksii uuden säännön. Jos sääntöä rikkoo, juo.");
        System.out.println("Sääntö: ");
        saannot.add(lukija.nextLine());
    }
    
    
}
