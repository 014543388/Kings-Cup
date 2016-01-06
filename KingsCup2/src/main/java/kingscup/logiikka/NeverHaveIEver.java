
package kingscup.logiikka;

import java.util.ArrayList;
import java.util.Random;


public class NeverHaveIEver {
    private ArrayList<String> kysymykset;
    private Random random = new Random();

    public NeverHaveIEver() {
        this.kysymykset = new ArrayList<>();
    }

    public ArrayList<String> getKysymykset() {
        return kysymykset;
    }
    
    public void lisaaKysymys(String kysymys){
        this.kysymykset.add(kysymys);
    }
    
    public String kysySeuraava(){
        if(this.kysymykset.isEmpty())return null;
        return "I have never/en ole koskaan " + this.kysymykset.remove(random.nextInt(kysymykset.size()));
    }
    
}
