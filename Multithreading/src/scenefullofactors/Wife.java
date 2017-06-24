/*
 * The Wife Class
 */
package scenefullofactors;

/**
 * Wife Class
 * @author MariusNeagu
 */
public class Wife extends Thread {

    private static Thread cigar;

    public Wife(Thread cigar) {
        this.cigar = cigar;
    }

    @Override
    public synchronized void run() {
        System.out.println("Wife enters the scene. ");
        cigar.start();
        while (true) {
            synchronized (this) {
                try {
                    System.out.println("Wife is sleeping.");
                    wait(3000);
                } catch (InterruptedException e) {
                    System.out.println("Wife wakes up.");
                    System.out.println("The woman snubs out her cigarette...");
                    cigar.interrupt();
                    System.out.println("and watches delighted her favourite show.");
                    break;
                }
            }
        }
    }
}
