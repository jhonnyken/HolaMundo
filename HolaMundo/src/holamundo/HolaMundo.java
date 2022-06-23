
package holamundo;

import java.util.Random;

/**
 *
 * @author juan
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Acabaste de hacer un pull de los cambios");
        System.out.println((int)(Math.random()*10+1) + "  El numero random es ");
    }

    public Integer randomNumber(){
        Random random = new Random();

        return random.nextInt();
    }
    
}
