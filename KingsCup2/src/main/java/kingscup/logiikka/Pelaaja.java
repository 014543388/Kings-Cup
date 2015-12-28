
package kingscup.logiikka;

import java.util.ArrayList;
import kingscup.logiikka.KingsCup.Sukupuoli;


public class Pelaaja {
    private Sukupuoli sukupoli;
    private String nimi;
    private int juonut;
    private ArrayList<Pelaaja> bitches;

    public Pelaaja(String nimi, Sukupuoli sukupuoli) {
        this.sukupoli = sukupuoli;
        this.nimi = nimi;
        this.bitches = new ArrayList<Pelaaja>();
        juonut = 0;
//        this.masters = new ArrayList<Pelaaja>();
    }

    public Sukupuoli getSukupoli() {
        return sukupoli;
    }

    public int getJuonut() {
        return juonut;
    }
    
    
    
    public void juo(){
        juonut++;
    }
    
    public void juoMonta(int kuinkaMonta){
        juonut += kuinkaMonta;
    }

    public ArrayList<Pelaaja> getBitches() {
        return bitches;
    }

    public String getNimi() {
        return nimi;
    }
    
    public void newBitch(Pelaaja pelaaja){
        if(this==pelaaja)return;
        if(this.bitches.contains(pelaaja))return;
        this.bitches.add(pelaaja);
    }
    
    
    
    public ArrayList<String> ketkaJuo(ArrayList<String> kaikkiJotkaJuovat){
        kaikkiJotkaJuovat.add(this.nimi);
//        ArrayList<Pelaaja> kaikkiJotkaJuovat = new ArrayList<>();
        for (Pelaaja p : this.bitches) {
            if(!kaikkiJotkaJuovat.contains(p.getNimi())){
                p.ketkaJuo(kaikkiJotkaJuovat);
            }
        }
        return kaikkiJotkaJuovat;
    }
    
    

    @Override
    public String toString() {
        String bitches = "none";
        if(this.bitches.size()>0){
            bitches = "";
            for (Pelaaja p : this.bitches) {
                bitches += p.getNimi()+", ";
            }
            bitches = bitches.substring(0, bitches.length()-2);
            
            return this.nimi+"\nBitches: "+bitches;
        }
        return this.nimi+"\nBitches: " + bitches;
    }
    
    
    
    
}
