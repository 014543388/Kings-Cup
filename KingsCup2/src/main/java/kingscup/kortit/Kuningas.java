
package kingscup.kortit;


public class Kuningas extends Kortti{
    private int suorituksia;

    public Kuningas() {
        suorituksia = 0;
    }
    
    

    @Override
    public void suorita() {
        if(suorituksia < 3){
            System.out.println("Its the Kings Cup\nNostaja kaataa kuppiin juotavaa");
        } else {
            System.out.println("Its the Kings Cup\nNostaja juo kupin sisällön");
        }
        suorituksia++;
        
    }
    
}
