
package kingscup.kortit;

import java.util.Scanner;


public class Assa extends Kortti{
    private Scanner lukija;
    

    public Assa(Scanner lukija) {
        this.lukija = lukija;
        nimi = "Ässä";
    }
    
    @Override
    public void suorita() {
        System.out.println("Ässä:");
        System.out.println("WATERFALL!");
        
        //kellota
    }

    public String getNimi() {
        return nimi;
    }
    

    
    
    
    
}
