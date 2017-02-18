/*
 * This program shows you how a keybord imput works
 */
package userimput;

/**
 * Simple keyboard imput in Java   
 * @author MariusNeagu
 */
import java.util.Scanner;
public class UserImput {

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
