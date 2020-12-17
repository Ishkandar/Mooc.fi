/** <h1>Part 1 - Message</h1>
 * <p>Write a program that asks the user to write
 * a string. When the user has provided the string
 * the program should print it as it was provided.</p>
 *
 * @author: Alex Dopico
 * @version: 1.0.0
 * @date: 17/12/2020
 */

import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        String userInput = scanner.nextLine();
        System.out.println(userInput);
    }
}
