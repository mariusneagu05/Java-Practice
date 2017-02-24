/*
 *  This is an example for instantiating a class
 */
package homework4;
import java.awt.Rectangle;

/**
 * Example of "new" keyword 
 * @author MariusNeagu
 */
public class SomethingIsWrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Rectangle myRect = new Rectangle(); //the new keyword was missing
                myRect.width = 40;
                myRect.height = 50;
                int area = myRect.width * myRect.height;
          System.out.println("My Rect`s area is: " + area);
    }
    
}