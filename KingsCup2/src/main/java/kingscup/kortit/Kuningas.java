
package kingscup.kortit;

import java.util.ArrayList;
import java.util.Scanner;


public class Kuningas extends Kortti{
    private Scanner lukija;
    private ArrayList<String> saannot = new ArrayList<>();
    private int suorituksia;

    public Kuningas(Scanner lukija) {
        this.lukija = lukija;
        suorituksia = 0;
    }
    
    

    @Override
    public void suorita() {
        System.out.println("Kuningas:");
        if(suorituksia < 3){
            System.out.println("Its the Kings Cup\nNostaja kaataa kuppiin juotavaa ja"
                    + " keksii uuden säännön. Jos sääntöä rikkoo, juo.");
            System.out.print("Sääntö: ");
            saannot.add(lukija.nextLine());
        } else {
            System.out.println("Its the Kings Cup\nNostaja juo kupin sisällön");
        }
        suorituksia++;
        
    }

    public ArrayList<String> getSaannot() {
        return saannot;
    }
    
    
    
}
