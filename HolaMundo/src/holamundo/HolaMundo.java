/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        System.out.println("El numero random es "+randomNumber().toString());
    }

    public Integer randomNumber(){
        Random random = new Random();

        return random.nextInt();
    }
    
}
