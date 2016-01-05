
package kingscup.kortit;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;
import static kingscup.logiikka.KingsCup.Sukupuoli.MIES;
import kingscup.logiikka.Pelaaja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SeitsemanTest {
    ByteArrayOutputStream tulosvirta;
    HashMap<String, Pelaaja> pelaajaHash;
    Pelaaja evan;
    
    public SeitsemanTest() {
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
    public void kysyyUudestaanJosAnnetaanVaaraNimi(){
        String syote = muodosta("kik","Evan");
        Seitseman seitseman = new Seitseman(new Scanner(syote), pelaajaHash);
        seitseman.suorita();
        assertTrue(tulosvirta.toString().contains("?"));
    }
    
    @Test
    public void asettaaHeavenMasterinOikein(){
        String syote = muodosta("Evan");
        Seitseman seitseman = new Seitseman(new Scanner(syote), pelaajaHash);
        seitseman.suorita();
        assertEquals(seitseman.getHeavenMaster(), evan);
    }
    
    private String muodosta(String... lines) {
        String linesWithEnter = "";
        for (String line : lines) {
            linesWithEnter += line + "\n";
        }
        return linesWithEnter;
    }

    
}
