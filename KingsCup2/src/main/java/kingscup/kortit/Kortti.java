
package kingscup.kortit;

public abstract class Kortti {
    String nimi;

    public Kortti() {
    }

    public String getNimi() {
        return Kortti.class.getName();
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    public abstract void suorita();

//    abstract String getSaanto();
//    
//    
    
    
    
}
