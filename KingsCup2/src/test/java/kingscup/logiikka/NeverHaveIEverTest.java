
package kingscup.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class NeverHaveIEverTest {
    NeverHaveIEver enkoskaan;
    
    public NeverHaveIEverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        enkoskaan = new NeverHaveIEver();
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void alussaNollaKysymysta(){
        assertEquals(enkoskaan.getKysymykset().size(), 0);
    }
    
    @Test
    public void oikeaMaaraKysymyksiaLisaystenJalkeen(){
        enkoskaan.lisaaKysymys("rsg");
        enkoskaan.lisaaKysymys("ölselfp");
        assertEquals(enkoskaan.getKysymykset().size(), 2);
    }
    
    @Test
    public void lisaaTismalleenOikeanKysymyksen(){
        enkoskaan.lisaaKysymys("miller");
        assertTrue(enkoskaan.getKysymykset().contains("miller"));
    }
    
    @Test
    public void poistaaKysytynKysymyksen(){
        enkoskaan.lisaaKysymys("rsg");
        enkoskaan.lisaaKysymys("ölselfp");
        enkoskaan.kysySeuraava();
        assertEquals(enkoskaan.getKysymykset().size(), 1);
    }
    
    @Test
    public void palauttaaNullJosKysymyksetLoppu(){
        assertEquals(enkoskaan.kysySeuraava(), null);
    }

    
}
