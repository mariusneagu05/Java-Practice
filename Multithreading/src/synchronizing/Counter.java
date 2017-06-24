/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizing;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Class Counter
 * @author MariusNeagu
 */
public class Counter {
    
    private AtomicInteger contor = new AtomicInteger(0);

    public AtomicInteger getContor() {
        return contor;
    }

    public void setContor(AtomicInteger contor) {
        this.contor = contor; 
    }
    
}
