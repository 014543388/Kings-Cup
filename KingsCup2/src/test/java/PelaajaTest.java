import java.util.ArrayList;
import static kingscup.logiikka.KingsCup.Sukupuoli.MIES;
import kingscup.logiikka.Pelaaja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PelaajaTest {
    
    Pelaaja p;

    public PelaajaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        p = new Pelaaja("P", MIES);
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void pelaajaJuonutAlussaNolla(){
        assertEquals(p.getJuonut(), 0);
    }
    
    @Test
    public void pelaajaJuonutUseanJuoman(){
        p.juoMonta(5);
        p.juo();
        p.juo();
        assertEquals(p.getJuonut(), 7);
    }

    @Test
    public void pelaajanTulostusNoMates() {
        assertTrue(p.toString().contains("none"));
    }
    
    @Test
    public void pelaajanTulostusWithMates() {
        Pelaaja k = new Pelaaja("K", MIES);
        p.newBitch(k);
        assertTrue(p.toString().contains("K"));
    }
    
    @Test
    public void eiVoiOllaItsensaMate(){
        p.newBitch(p);
        assertEquals(p.getBitches().size(), 0);
    }
    
    @Test
    public void ketkaJuovatKunPelaajallaNoMates() {
        assertTrue(p.ketkaJuo(new ArrayList<String>()).size()==1);
    }
    
    @Test
    public void ketkaJuovatKunPelaajallaYksiMate() {
        Pelaaja k = new Pelaaja("K", MIES);
        p.newBitch(k);
        assertTrue(p.ketkaJuo(new ArrayList<String>()).size()==2);
    }
    
    @Test
    public void ketkaJuovatKunPelaajallaMateKetjuLooppi() {
        Pelaaja k = new Pelaaja("K", MIES);
        p.newBitch(k);
        
        Pelaaja s = new Pelaaja("s", MIES);
        Pelaaja d = new Pelaaja("d", MIES);
        
        k.newBitch(s);
        s.newBitch(d);
        d.newBitch(p);
        
        assertTrue(p.ketkaJuo(new ArrayList<String>()).size()==4);
    }
    
}
