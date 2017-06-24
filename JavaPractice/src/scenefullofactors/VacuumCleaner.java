/*
 * The VacuumCleaner Class
 */
package scenefullofactors;

/**
 * VacuumCleaner Class
 * @author MariusNeagu
 */
public class VacuumCleaner extends Thread {

    @Override
    public synchronized void run() {
        System.out.println("The vacuumcleaner has stoped.");
    }
}
