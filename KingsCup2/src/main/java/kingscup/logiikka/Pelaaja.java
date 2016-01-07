
package kingscup.logiikka;

import java.util.ArrayList;
import kingscup.logiikka.KingsCup.Sukupuoli;


public class Pelaaja {
    private final Sukupuoli sukupoli;
    private String nimi;
    private int juonut;
    private ArrayList<Pelaaja> mates;

    public Pelaaja(String nimi, Sukupuoli sukupuoli) {
        this.sukupoli = sukupuoli;
        this.nimi = nimi;
        this.mates = new ArrayList<Pelaaja>();
        juonut = 0;
//        this.masters = new ArrayList<Pelaaja>();
    }
    
    /**
     * 
     * @return pelaajan sukupuoli
     */

    public Sukupuoli getSukupoli() {
        return sukupoli;
    }
    
    /**
     * 
     * @return pelaajan tähän asti juomat juomat
     */

    public int getJuonut() {
        return juonut;
    }
    
    public void juo(){
        ArrayList<Pelaaja> juojat = ketkaJuo(new ArrayList<Pelaaja>());
        for(Pelaaja p : juojat){
            p.huikka();
        }
    }
    
    private void huikka(){
        juonut++;
    }
    
    public void juoMonta(int kuinkaMonta){
        juonut += kuinkaMonta;
    }

    public ArrayList<Pelaaja> getMates() {
        return mates;
    }

    public String getNimi() {
        return nimi;
    }
    
    public void newMate(Pelaaja pelaaja){
        if(this==pelaaja)return;
        if(this.mates.contains(pelaaja))return;
        this.mates.add(pelaaja);
    }
    
    
    
    public ArrayList<Pelaaja> ketkaJuo(ArrayList<Pelaaja> kaikkiJotkaJuovat){
        kaikkiJotkaJuovat.add(this);
//        ArrayList<Pelaaja> kaikkiJotkaJuovat = new ArrayList<>();
        for (Pelaaja p : this.mates) {
            if(!kaikkiJotkaJuovat.contains(p)){
                p.ketkaJuo(kaikkiJotkaJuovat);
            }
        }
        return kaikkiJotkaJuovat;
    }
    
    

    @Override
    public String toString() {
        String bitches = "none";
        if(this.mates.size()>0){
            bitches = "";
            for (Pelaaja p : this.mates) {
                bitches += "\n"+p.getNimi();
            }
            bitches = bitches.substring(0, bitches.length());
            
            return this.nimi+"\n\nJuonut yhteensä: "+ juonut +"\n\nMates: "+bitches;
        }
        return this.nimi+"\n\nJuonut yhteensä: "+ juonut +"\n\nMates: " + bitches;
    }
    
    
    
    
}
