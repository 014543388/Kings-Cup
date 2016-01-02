
package KortitTest;

import java.util.HashMap;
import kingscup.kortit.Kortti;
import kingscup.kortit.Kuusi;
import kingscup.kortit.Nelja;
import kingscup.logiikka.KingsCup;
import kingscup.logiikka.Pelaaja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KuusiTest {
    HashMap<String, Pelaaja> pelaajat;
    Kortti kuusi;
    Pelaaja evan;
    Pelaaja hoami;
    
    public KuusiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pelaajat = new HashMap<>();
        evan = new Pelaaja("Evan", KingsCup.Sukupuoli.MIES);
        hoami = new Pelaaja("hoami", KingsCup.Sukupuoli.NAINEN);
        pelaajat.put(evan.getNimi(), evan);
        pelaajat.put(hoami.getNimi(), hoami);
        
        kuusi = new Kuusi(pelaajat);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void vainMiehettJuovat(){
        kuusi.suorita();
        assertEquals(hoami.getJuonut()+1, evan.getJuonut());
    }
    
}
