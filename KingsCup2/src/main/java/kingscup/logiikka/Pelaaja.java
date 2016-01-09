
package kingscup.logiikka;

import java.util.ArrayList;


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
    
    
    /**
     * Kasvattaa tämän olion sekä, jokaisen olion maten (myös epäsuoran maten)
     * juonut-arvoa yhdellä. Käyttää ketkaJuo-apumetodia.
     * 
     * 
     * @see kingscup.logiikka.Pelaaja.ketkaJuo()
     */
    public void juo(){
        ArrayList<Pelaaja> juojat = ketkaJuo(new ArrayList<Pelaaja>());
        for(Pelaaja p : juojat){
            p.huikka();
        }
    }
    
    /**
     * Kasvattaa juuri tämän olion
     * juonut-arvoa yhdellä.
     * 
     */
    private void huikka(){
        juonut++;
    }
    
    /**
     * Kasvattaa juuri tämmän olion juonut-arvoa
     * annetulla määrällä
     * 
     * @param lisättävien juomien määrä
     * 
     */
    public void juoMonta(int kuinkaMonta){
        juonut += kuinkaMonta;
    }

    public ArrayList<Pelaaja> getMates() {
        return mates;
    }

    public String getNimi() {
        return nimi;
    }
    
    /**
     * Lisää pelaajalle maten (toisen pelaajan)
     * @param mateksi asetettava pelaaja
     */
    public void newMate(Pelaaja pelaaja){
        if(this==pelaaja)return;
        if(this.mates.contains(pelaaja))return;
        this.mates.add(pelaaja);
    }
    
    
    /**
     * Selvittää rekursiivisesti, keiden kaikkien tulee juoda
     * tämän pelaajan juodessa mate-ketjujen johdosta
     * 
     * @param aluksi tyhjä ArrayList, jota rekursio täyttää
     */
    public ArrayList<Pelaaja> ketkaJuo(ArrayList<Pelaaja> kaikkiJotkaJuovat){
        kaikkiJotkaJuovat.add(this);
        for (Pelaaja p : this.mates) {
            if(!kaikkiJotkaJuovat.contains(p)){
                p.ketkaJuo(kaikkiJotkaJuovat);
            }
        }
        return kaikkiJotkaJuovat;
    }
    
    
    /**
     * Pelaajan GUI-ikkunassa näkyvä teksti
     */
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
