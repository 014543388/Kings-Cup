
package kingscup.logiikka;

import kingscup.kortit.Kortti;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import kingscup.kortit.Assa;
import kingscup.kortit.Kaksi;


public class Korttipakka {
    private Scanner lukija;
    private HashMap<Integer, Integer> korttienMaarat;
    private HashMap<Integer, Kortti> kortit;
    private Random random;

    public Korttipakka(HashMap<Integer, Kortti> kortit) {
        this.kortit = kortit;
        korttienMaarat = new HashMap<>();
        pakanLisays();
        random = new Random();
    }
    
    private void pakanLisays(){
        for(int i = 1; i < kortit.keySet().size()+1;i++){
            if(korttienMaarat.containsKey(i)){
                korttienMaarat.put(i, korttienMaarat.get(i)+4);
            }else{
                korttienMaarat.put(i, 4);
            }
            
        }
        //lisää kortit hashmappiin tassa?
    }
    
    
    
    public Kortti nostaSatunnainenKortti(){
        int eriKortteja = kortit.keySet().size();
        int kortinNumero = random.nextInt(eriKortteja) + 1;
        while(korttienMaarat.get(kortinNumero)==0){
            kortinNumero = random.nextInt(eriKortteja) + 1;
        }
        korttienMaarat.put(kortinNumero, korttienMaarat.get(kortinNumero)-1);
        
        return kortit.get(kortinNumero);
    }
    
    public Kortti nostaKortti(int i){
        if(i<1||i>kortit.keySet().size())return null;
        if(korttienMaarat.get(i)==0)return null;
        korttienMaarat.put(i, korttienMaarat.get(i)-1);
        return kortit.get(i);
    }
    
    public int korttejaYhteensa(){
        int kortteja = 0;
        for(int i : korttienMaarat.keySet()){
            kortteja += korttienMaarat.get(i);
        }
        return kortteja;
    }
    
}
