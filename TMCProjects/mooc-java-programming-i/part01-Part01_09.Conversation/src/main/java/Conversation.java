/**<h1>Conversation</h1>
 * @author Alex Dopico
 * @version 1.0.0
 * @since 19/12/2020
 */
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");
        String firstResponse = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String secondResponse = scanner.nextLine();
        System.out.println("Thanks for sharing!");

    }
}