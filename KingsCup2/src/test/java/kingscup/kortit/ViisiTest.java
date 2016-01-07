
package kingscup.kortit;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;
import kingscup.kortit.Kaksi;
import kingscup.kortit.Viisi;
import kingscup.logiikka.Pelaaja;
import static kingscup.logiikka.Sukupuoli.MIES;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ViisiTest {
    ByteArrayOutputStream tulosvirta;
    HashMap<String, Pelaaja> pelaajaHash;
    Pelaaja evan;
    
    public ViisiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tulosvirta = new ByteArrayOutputStream();
        System.setOut(new PrintStream(tulosvirta));
        pelaajaHash = new HashMap<>();
        
        evan = new Pelaaja("Evan", MIES);
        pelaajaHash.put(evan.getNimi(), evan);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void oikeaHloJuo(){
        String syote = muodosta("Evan");
        Viisi viisi = new Viisi(new Scanner(syote), pelaajaHash);
        viisi.suorita();
        assertEquals(evan.getJuonut(), 1);
    }
    
    @Test
    public void kysyyUudestaanJosAnnetaanVaaraNimi(){
        String syote = muodosta("kik","Evan");
        Viisi viisi = new Viisi(new Scanner(syote), pelaajaHash);
        viisi.suorita();
        assertTrue(tulosvirta.toString().contains("?"));
    }
    
    private String muodosta(String... lines) {
        String linesWithEnter = "";
        for (String line : lines) {
            linesWithEnter += line + "\n";
        }
        return linesWithEnter;
    }
}
