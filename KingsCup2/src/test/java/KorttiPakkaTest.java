

import java.util.HashMap;
import java.util.Scanner;
import kingscup.kortit.Assa;
import kingscup.kortit.Kaksi;
import kingscup.kortit.Kortti;
import kingscup.logiikka.Korttipakka;
import kingscup.logiikka.Pelaaja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KorttiPakkaTest {
    Korttipakka pakka;
    Scanner lukija;
    
    public KorttiPakkaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        HashMap<String, Pelaaja> pelaajaHash = new HashMap<>();
        HashMap<Integer, Kortti> kortit = new HashMap<>();
        kortit.put(1, new Assa());
        kortit.put(2, new Kaksi(lukija, pelaajaHash));
        
        pakka = new Korttipakka(kortit);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void korttejaOikeaMaaraAlussa(){
        assertTrue(pakka.korttejaYhteensa()==8);
    }

    @Test
    public void korttejaOikeaMaaraNostojenJAlkeen(){
        pakka.nostakortti();
        pakka.nostakortti();
        assertTrue(pakka.korttejaYhteensa()==6);
    }
    
}
