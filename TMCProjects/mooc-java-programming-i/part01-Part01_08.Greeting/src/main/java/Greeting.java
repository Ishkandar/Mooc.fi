/**<h1>Part 1 - Greeting</h1>
 * <p>Write a program that prompts the user for their
 * name their name with the message "What's your name?".
 * When the user has written their name, the program has
 * to print "Hi", followed by the user's name.
 *
 * @author Alex Dopico
 * @version 1.0.0
 * @since 19/12/2020
 */

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = scanner.nextLine();
        System.out.printf("Hi %s", userName);
    }
}
