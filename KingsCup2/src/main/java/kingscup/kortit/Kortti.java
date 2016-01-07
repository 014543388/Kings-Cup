
package kingscup.kortit;

public abstract class Kortti {
    String nimi;

    public Kortti() {
    }

    public String getNimi() {
        return Kortti.class.getName();
    }
    
    
    
    public abstract void suorita();

//    abstract String getSaanto();
//    
//    
    
    
    
}
