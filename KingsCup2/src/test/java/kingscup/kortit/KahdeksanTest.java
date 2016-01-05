
package kingscup.kortit;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;
import static kingscup.logiikka.KingsCup.Sukupuoli.MIES;
import static kingscup.logiikka.KingsCup.Sukupuoli.NAINEN;
import kingscup.logiikka.Pelaaja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KahdeksanTest {
    ByteArrayOutputStream tulosvirta;
    HashMap<String, Pelaaja> pelaajaHash;
    Pelaaja evan;
    Pelaaja hoami;
    Pelaaja mati;
    
    public KahdeksanTest() {
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
        hoami = new Pelaaja("Hoami", NAINEN);
        mati = new Pelaaja("Mati", MIES);
        pelaajaHash.put(evan.getNimi(), evan);
        pelaajaHash.put(hoami.getNimi(), hoami);
        pelaajaHash.put(mati.getNimi(), mati);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void asettaaMatenOikeilleIhmisille(){
        String syote = muodosta("Evan","Hoami");
        Kahdeksan kahdeksan = new Kahdeksan(new Scanner(syote), pelaajaHash);
        kahdeksan.suorita();
        
        assertTrue(evan.getMates().size() == 1);
    }
    
    @Test
    public void asettaaMateksiOikeanIhmisen(){
        String syote = muodosta("Evan","Hoami");
        Kahdeksan kahdeksan = new Kahdeksan(new Scanner(syote), pelaajaHash);
        kahdeksan.suorita();
        
        assertEquals(evan.getMates().get(0), hoami);
    }
    
    @Test
    public void eiAsetaSamaaMateaUseaanKertaanVaanKysyyUudestaan(){
        evan.newMate(hoami);
        String syote = muodosta("Evan","Hoami","Evan","Mati");
        Kahdeksan kahdeksan = new Kahdeksan(new Scanner(syote), pelaajaHash);
        kahdeksan.suorita();
        
        assertTrue(this.tulosvirta.toString().contains("Kaveriyhteys"));
    }
    
    @Test
    public void kysyyUudestaanJosNostajanNimiVaarin(){
        String syote = muodosta("Evan","erger","Evan","Mati");
        Kahdeksan kahdeksan = new Kahdeksan(new Scanner(syote), pelaajaHash);
        kahdeksan.suorita();
        
        assertTrue(this.tulosvirta.toString().contains("Ainakin"));
    }
    
    @Test
    public void kysyyUudestaanJosKaverinNimiVaarin(){
        String syote = muodosta("aåevcn","Evan","Evan","Mati");
        Kahdeksan kahdeksan = new Kahdeksan(new Scanner(syote), pelaajaHash);
        kahdeksan.suorita();
        
        assertTrue(this.tulosvirta.toString().contains("Ainakin"));
    }
    
    @Test
    public void kysyyUudestaanJosMolemmatNimetVaarin(){
        String syote = muodosta("aåevcn","pkasnc","Evan","Mati");
        Kahdeksan kahdeksan = new Kahdeksan(new Scanner(syote), pelaajaHash);
        kahdeksan.suorita();
        
        assertTrue(this.tulosvirta.toString().contains("Ainakin"));
    }
    
    @Test
    public void asettaaUseanMatenOikein(){
        
        String syote = muodosta("Evan","Hoami","Evan","Mati");
        Kahdeksan kahdeksan = new Kahdeksan(new Scanner(syote), pelaajaHash);
        kahdeksan.suorita();
        kahdeksan.suorita();
        
        assertTrue(evan.getMates().size()==2);
    }

    private String muodosta(String... lines) {
        String linesWithEnter = "";
        for (String line : lines) {
            linesWithEnter += line + "\n";
        }
        return linesWithEnter;
    }
}
