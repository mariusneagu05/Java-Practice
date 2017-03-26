/*
 * In this application the method .getRuntime() of Runtime class
 * launches 3 Notepad files 
 */
package notepad;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Simple Java app which launches 3 Notepad files
 * @author MariusNeagu
 */
class Notepad {

    public static void main(String[] args) throws IOException {
        try {
            ProcessBuilder pb;
            // Use process builder to start 3 processes of notepad
            pb = new ProcessBuilder("Notepad");
            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
        } catch (IOException ex) {
            Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
    }
}
