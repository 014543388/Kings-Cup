package kingscup.logiikka;



import java.util.HashMap;
import java.util.Scanner;
import kingscup.kortit.Assa;
import kingscup.kortit.Kaksi;
import kingscup.kortit.Kortti;
import kingscup.kortit.Loppukortti;
import kingscup.logiikka.Korttipakka;
import kingscup.logiikka.Pelaaja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KorttipakkaTest {
    Korttipakka pakka;
    Scanner lukija;
    
    public KorttipakkaTest() {
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
        kortit.put(1, new Assa(lukija));
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
    public void korttejaOikeMaaraNostojenJalkeen(){
        pakka.nostaKortti(1);
        pakka.nostaKortti(2);
        pakka.nostaKortti(2);
        assertTrue(pakka.korttejaYhteensa()==5);
    }

    @Test
    public void korttejaOikeaMaaraSatunnaistenNostojenJAlkeen(){
        pakka.nostaSatunnainenKortti();
        pakka.nostaSatunnainenKortti();
        assertTrue(pakka.korttejaYhteensa()==6);
    }
    
    @Test
    public void tiettyaKorttiaOikeaMaaraNostojenJalkeen(){
        pakka.nostaKortti(2);
        int kakkosia = pakka.getKorttienMaarat().get(2);
        assertEquals(kakkosia, 3);
    }
    
    @Test
    public void palauttaaNullJosNostaaSatunnaisenTyhjastaPakasta(){
        HashMap<String, Pelaaja> pelaajaHash = new HashMap<>();
        HashMap<Integer, Kortti> kortit = new HashMap<>();
        pakka = new Korttipakka(kortit);
        assertEquals(pakka.nostaSatunnainenKortti(), null);
    }
    
    @Test
    public void palauttaaLoppukortinJosNostetaanLoppunutKortti(){
        Kortti assa = pakka.nostaKortti(1);
        pakka.nostaKortti(1);
        pakka.nostaKortti(1);
        pakka.nostaKortti(1);
        assertTrue(pakka.nostaKortti(1)!=assa);
    }
    
    @Test
    public void nostaKorttiNostaaOikeanKortin(){
        HashMap<String, Pelaaja> pelaajaHash = new HashMap<>();
        HashMap<Integer, Kortti> kortit = new HashMap<>();
        kortit.put(1, new Assa(lukija));
        kortit.put(2, new Kaksi(lukija, pelaajaHash));
        
        pakka = new Korttipakka(kortit);
        assertEquals(pakka.nostaKortti(1), kortit.get(1));
    }
    
    @Test
    public void nostaKorttiPaluttaaNullJosIndeksiHuono(){
        assertEquals(pakka.nostaKortti(0), null);
    }
    
}
