/*
 * In this application the method .getRuntime() of Runtime class
 * launches 3 Notepad files with some text inside
 */
package notepad;

import java.util.*;
import java.io.*;
/**
 * Simple Java app which launches 3 Notepad files
 * @author MariusNeagu
 */
class Notepad {

    public static void main(String[] args) {
        //creating 3 Runtime objects
        Runtime runnotepad = Runtime.getRuntime();
        Runtime runnotepad1 = Runtime.getRuntime();
        Runtime runnotepad2 = Runtime.getRuntime();
        //using exec method to open the specified notepad files
        try {
            runnotepad.exec("Notepad D:\\SCOALA INFORMALA\\3notepad\\notepad.txt");
            runnotepad1.exec("Notepad D:\\SCOALA INFORMALA\\3notepad\\notepad1.txt");
            runnotepad2.exec("Notepad D:\\SCOALA INFORMALA\\3notepad\\notepad2.txt");
        //catch IOException e
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
