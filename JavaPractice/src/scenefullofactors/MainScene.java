/*
 * This is the main scene, where all the actors play their rolles.
 */
package scenefullofactors;

/**
 * Main scene
 * @author MariusNeagu
 */
public class MainScene {

    public static void main(String[] args) {
      
       Thread scene = new Tv(new Husband(new VacuumCleaner(), new Wife(new Cigarette())));
       scene.start();
    }
}
