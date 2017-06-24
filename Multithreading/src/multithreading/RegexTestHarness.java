/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author MariusNeagu
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

    public static void main(String[] args) throws IOException {

        while (true) {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nEnter your regex:");

            Pattern pattern
                    = Pattern.compile(br.readLine());

            System.out.println("\nEnter input string to search:");
            Matcher matcher
                    = pattern.matcher(br.readLine());

            boolean found = false;
            while (matcher.find()) {
                System.out.format("I found the text"
                        + " \"%s\" starting at "
                        + "index %d and ending at index %d.%n",
                        matcher.group(),
                        matcher.start(),
                        matcher.end());
                found = true;
            }
            if (!found) {
                System.out.println("No match found.");
            }
        }
    }
}
