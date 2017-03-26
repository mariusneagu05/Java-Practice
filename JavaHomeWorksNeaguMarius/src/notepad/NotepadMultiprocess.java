/*
 * In this application I used the Processbuilder to
 * launch 3 Notepad processes
 */
package notepad;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Simple Java app which launches 3 Notepad processes
 * @author MariusNeagu
 */
class NotepadMultiprocess {

    public static void main(String[] args) {
        try {
            // Use process builder to start 3 processes of notepad
            ProcessBuilder pb;
            pb = new ProcessBuilder("Notepad");
            //starting the 3 processes
            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
            } catch (IOException ex) {
            Logger.getLogger(NotepadMultiprocess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
    } 
}
            
            
        
        
        
        
        
        
        
        
      