/*
 * TV Class
 */
package scenefullofactors;

/**
 * Tv Class
 * @author MariusNeagu
 */
public class Tv extends Thread {

    private Thread husband;

    public Tv(Thread husband) {
        this.husband = husband;
    }

    @Override
    public synchronized void run() {
        System.out.println("TV is running..");
        husband.start();
        husband.interrupt();
    }
}
