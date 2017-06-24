/*
 * Using AtomicIntiger to increment and decrement a variable in
 * a multithreading application
 */
package synchronizing;

/**
 * Test AtomicInteger 
 * @author MariusNeagu
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Counter contor = new Counter();
        for( int i = 0; i<500; i++){
        Adunare a = new Adunare(contor);
        Scadere s = new Scadere(contor);
        a.start();
        s.start();
        System.out.println("Counter = " + contor.getContor());
        }    
    }  
}
        



        