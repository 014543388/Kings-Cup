
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

/**
 *
 * @author eamiller
 */
public class KuningasTest {
    ByteArrayOutputStream tulosvirta;
    
    public KuningasTest() {
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
    public void saantoLisataanListaan() {
        String syote = muodosta("saanto x");
        Kuningas kuningas = new Kuningas(new Scanner(syote));
        kuningas.suorita();
        assertTrue(kuningas.getSaannot().size()== 1);
    }
    
    @Test
    public void tulostusMuuttuuKolmenSuorituksenJalkeen(){
        String syote = muodosta("saanto x","Saanto y","Saanto z");
        Kuningas kuningas = new Kuningas(new Scanner(syote));
        kuningas.suorita();
        kuningas.suorita();
        kuningas.suorita();
        kuningas.suorita();
        assertTrue(tulosvirta.toString().contains("Nostaja juo"));
    }

    private String muodosta(String... lines) {
        String linesWithEnter = "";
        for (String line : lines) {
            linesWithEnter += line + "\n";
        }
        return linesWithEnter;
    }
}
