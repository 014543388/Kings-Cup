
package kingscup.kortit;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KymmenenTest {
    ByteArrayOutputStream tulosvirta;
    
    public KymmenenTest() {
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
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void kysyyTasan5Kysymysta(){
        String syote = muodosta("1","2","3","4","5", "6");
        Kymmenen kymmenen = new Kymmenen(new Scanner(syote));
        int kysymyksiaAlussa = kymmenen.kysymyksiaJaljella();
        kymmenen.suorita();
        
        assertEquals(kysymyksiaAlussa, kymmenen.kysymyksiaJaljella()+5);
    }
    
    @Test
    public void kertooJosKysymyksetLoppuvat(){
        String syote = muodosta("1","2","3","4","5", "6","7","8", "9","10",
                "11","12","13","14","15","16");
        Kymmenen kymmenen = new Kymmenen(new Scanner(syote));
        int kysymyksiaAlussa = kymmenen.kysymyksiaJaljella();
        kymmenen.suorita();
        kymmenen.suorita();
        kymmenen.suorita();
        kymmenen.suorita();
        
        assertEquals(0, kymmenen.kysymyksiaJaljella());
        assertTrue(this.tulosvirta.toString().contains("ovat loppu"));
    }
    
    
    private String muodosta(String... lines) {
        String linesWithEnter = "";
        for (String line : lines) {
            linesWithEnter += line + "\n";
        }
        return linesWithEnter;
    }
}
