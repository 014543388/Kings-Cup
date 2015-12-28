
package kingscup.logiikka;

import java.util.ArrayList;
import java.util.Random;


public class NeverHaveIEver {
    private ArrayList<String> kysymykset;
    private ArrayList<String> kysytyt;
    private Random random = new Random();

    public NeverHaveIEver() {
        this.kysymykset = new ArrayList<>();
        this.kysytyt = new ArrayList<>();
    }
    
    public void lisaaKysymys(String kysymys){
        this.kysymykset.add(kysymys);
    }
    
    public String kysySeuraava(){
        return this.kysymykset.remove(random.nextInt(kysymykset.size()));
    }
    
}
