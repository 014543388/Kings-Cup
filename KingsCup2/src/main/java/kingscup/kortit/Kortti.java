package kingscup.kortit;

public abstract class Kortti {

    String nimi;

    public Kortti() {
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Suorittaa jokaiselle kortille ominaisen toiminnon
     */
    public abstract void suorita();
   
}
