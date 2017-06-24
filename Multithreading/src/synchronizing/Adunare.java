/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizing;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Class Adunare
 * @author MariusNeagu
 */
public class Adunare extends Thread {
    
    Counter contor;
    
    public Adunare(Counter contorFromTest){
        contor = contorFromTest;
    }
    
    @Override
    public void run(){
       
        AtomicInteger temp = contor.getContor();
        temp.incrementAndGet();
        contor.setContor(temp);
    }
}
