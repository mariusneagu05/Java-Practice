/*
 * In this class are created four methods to manipulate
 * a string by writting, reading, adding and deleting 
 */
package exceptionshomework;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Declaring four methods to write, read, add and delete a string 
 * @author MariusNeagu
 */
public class FilesManagement {
    //first method is to write a string into a file specified as parameter
    public static void WriteInFile(){
        try {
            FileWriter fw = new FileWriter ("Marius.txt");
            PrintWriter pw = new PrintWriter (fw);
            pw.println("First line");
            pw.println("Second line");
            pw.println("Third line");
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(FilesManagement.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    //one to read, if exists, the whole content of a specified file as parameter into a string
    public static void ReadFromFile(){
    FileReader fr = null;
        try {
            fr = new FileReader("Marius.txt");
            
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
        }
        
    BufferedReader br = new BufferedReader (fr);
    String str;
        try {
            while ((str = br.readLine()) != null){
                System.out.println(str + "\n");
            }   
        } catch (IOException ex) {
            Logger.getLogger(FilesManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //the third one to add a string content into an empty file specified as parameter
    public static void WriteInEmptyFile(){
        try {
            FileWriter fw = new FileWriter ("Empty_file.txt");
            PrintWriter pw = new PrintWriter (fw);
            pw.println("cucumber");
            pw.println("wine");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FilesManagement.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    //the final one to delete a content of a specified file as parameter
    public static void DeleteContentOfFile(){
        try {
            FileWriter fw = new FileWriter ("Empty_file.txt");
            PrintWriter pw = new PrintWriter (fw);
            pw.println("");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FilesManagement.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}