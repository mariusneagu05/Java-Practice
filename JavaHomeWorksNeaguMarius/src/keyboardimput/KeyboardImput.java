/*
 * This application shows you how a keybord imput works
 */
package keyboardimput;

/**
 * Simple keyboard imput in Java
 * @author MariusNeagu
 */
import java.util.Scanner;
public class KeyboardImput {

    /**
     * @param args keyboard imput
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What is your Name?");
        System.out.print("Please type here: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "! This is how keyboard imput works.");
    }
    
}
