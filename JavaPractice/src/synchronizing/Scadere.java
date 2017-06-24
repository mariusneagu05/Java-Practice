/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizing;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Class Scadere
 * @author MariusNeagu
 */
public class Scadere extends Thread {
    
    Counter contor;
    
    public Scadere(Counter contorFromTest){
        contor = contorFromTest;
    }

    @Override
    public void run(){
      
        AtomicInteger temp = contor.getContor();
        temp.decrementAndGet();
        contor.setContor(temp);
    }
}
