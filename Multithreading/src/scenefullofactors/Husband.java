/*
 * The Husband Class
 */
package scenefullofactors;

/**
 * Husband Class
 * @author MariusNeagu
 */
public class Husband extends Thread {

    private static Thread vacuumCleaner;
    private static Thread wife;

    public Husband(Thread wife, Thread vacuumCleaner) {
        this.wife = wife;
        this.vacuumCleaner = vacuumCleaner;
    }

    @Override
    public synchronized void run() {
        System.out.println("The husband see`s that his wife favourite TV show starts.");
        wife.start();
        vacuumCleaner.start();
        while (true) {
            try {
                System.out.println("Husband is vacuuming.");
                sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("The man touches his wife shoulder and whisper:");
                vacuumCleaner.interrupt();
                System.out.println("Honey wake up! Your favourite TV show has start.");
                wife.interrupt();
                break;
            }
        }
    }
}
