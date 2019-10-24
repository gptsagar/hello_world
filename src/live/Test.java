
package live;
import music.playable;
import music.string.Veena;
import music.wind.saxophone;

/**
 *
 * @author gptsagar007
 */
public class Test 
{
    public static void main(String[] args) {
        playable x= new Veena();
        x.play();
         playable y=new saxophone();
         y.play();
    }
}
