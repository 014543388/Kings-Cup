package kingscup.logiikka;



import java.util.ArrayList;
import kingscup.logiikka.Pelaaja;
import static kingscup.logiikka.Sukupuoli.MIES;
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
    public void pelaajallaAlussaNollaMatea(){
        assertTrue(p.getMates().isEmpty());
    }
    
    @Test
    public void pelaajaSaanutMateja(){
        Pelaaja k = new Pelaaja("K", MIES);
        Pelaaja s = new Pelaaja("s", MIES);
        p.newMate(k);
        p.newMate(s);
        assertEquals(p.getMates().size(), 2);
    }

    @Test
    public void pelaajanTulostusNoMates() {
        assertTrue(p.toString().contains("none"));
    }
    
    @Test
    public void pelaajanTulostusWithMates() {
        Pelaaja k = new Pelaaja("K", MIES);
        p.newMate(k);
        assertTrue(p.toString().contains("K"));
    }
    
    @Test
    public void eiVoiOllaItsensaMate(){
        p.newMate(p);
        assertEquals(p.getMates().size(), 0);
    }
    
    @Test
    public void ketkaJuovatKunPelaajallaNoMates() {
        assertTrue(p.ketkaJuo(new ArrayList<Pelaaja>()).size()==1);
    }
    
    @Test
    public void ketkaJuovatKunPelaajallaYksiMate() {
        Pelaaja k = new Pelaaja("K", MIES);
        p.newMate(k);
        assertTrue(p.ketkaJuo(new ArrayList<Pelaaja>()).size()==2);
    }
    
    @Test
    public void ketkaJuovatKunPelaajallaMateKetju(){
        Pelaaja k = new Pelaaja("K", MIES);
        Pelaaja s = new Pelaaja("s", MIES);
        Pelaaja d = new Pelaaja("d", MIES);
        p.newMate(k);
        k.newMate(s);
        s.newMate(d);
        
        assertTrue(p.ketkaJuo(new ArrayList<Pelaaja>()).contains(p));
        assertTrue(p.ketkaJuo(new ArrayList<Pelaaja>()).contains(k));
        assertTrue(p.ketkaJuo(new ArrayList<Pelaaja>()).contains(s));
        assertTrue(p.ketkaJuo(new ArrayList<Pelaaja>()).contains(d));
        assertTrue(p.ketkaJuo(new ArrayList<Pelaaja>()).size()==4);
    }
    
    @Test
    public void ketkaJuovatKunPelaajallaMateKetjuLooppi() {
        Pelaaja k = new Pelaaja("K", MIES);
        Pelaaja s = new Pelaaja("s", MIES);
        Pelaaja d = new Pelaaja("d", MIES);
        
        p.newMate(k);
        k.newMate(s);
        s.newMate(d);
        d.newMate(p);
        
        assertTrue(p.ketkaJuo(new ArrayList<Pelaaja>()).size()==4);
    }
    
    @Test
    public void matetJuoKunPelaajaJuo(){
        Pelaaja k = new Pelaaja("K", MIES);
        Pelaaja s = new Pelaaja("s", MIES);
        Pelaaja d = new Pelaaja("d", MIES);
        p.newMate(k);
        p.newMate(s);
        p.newMate(d);
        
        p.juo();
        
        assertEquals(p.getJuonut(), 1);
        assertEquals(k.getJuonut(), 1);
        assertEquals(s.getJuonut(), 1);
        assertEquals(d.getJuonut(), 1);
    }
    
    @Test
    public void eiAsetaSamaaMateaUseaanKertaan(){
        Pelaaja k = new Pelaaja("K", MIES);
        p.newMate(k);
        p.newMate(k);
        
        assertEquals(p.getMates().size(), 1);
    }
    
}
