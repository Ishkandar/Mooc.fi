/**<h1>Part 1 - Message Three Times</h1>
 * <p>Write a program that asks the user to write a string.
 * When the user has given a string (that is, written some
 * text and pressed enter), the program must print the
 * user's string three times.
 *
 * @author Alex Dopico
 * @version 1.0.0
 * @date 19/12/2020
 */

import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        String userInput = scanner.nextLine();

        System.out.println(userInput);
        System.out.println(userInput);
        System.out.println(userInput);

    }
}
