/*
 * The Cigarette class
 */
package scenefullofactors;

/**
 * The Cigarette class
 * @author MariusNeagu
 */
public class Cigarette extends Thread {

    @Override
    public synchronized void run() {
        System.out.println("Cigarette burns continuously.");
    }
}
