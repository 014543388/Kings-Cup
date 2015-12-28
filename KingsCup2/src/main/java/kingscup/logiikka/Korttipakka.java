
package kingscup.logiikka;

import kingscup.kortit.Kortti;
import java.util.HashMap;
import java.util.Random;


public class Korttipakka {
    private HashMap<Integer, Integer> korttienMaarat;
    private HashMap<Integer, Kortti> kortit;
    private int korttejaJaljella;
    Random random;

    public Korttipakka() {
        kortit = new HashMap<>();
        korttienMaarat = new HashMap<>();
        korttejaJaljella = 52;
        random = new Random();
    }
    
    private void pakanLisays(){
        for(int i = 1; i < 14;i++){
            korttienMaarat.put(i, 4);
        }
        //lisää kortit hashmappiin tassa
    }
    
    
    
    public Kortti nostakortti(){
        int kortinNumero = random.nextInt(52) + 1;
        while(korttienMaarat.get(kortinNumero)==0){
            kortinNumero = random.nextInt(52) + 1;
        }
        korttienMaarat.put(kortinNumero, korttienMaarat.get(kortinNumero)-1);
        korttejaJaljella--;
        
        return kortit.get(kortinNumero);
    }
    
}
