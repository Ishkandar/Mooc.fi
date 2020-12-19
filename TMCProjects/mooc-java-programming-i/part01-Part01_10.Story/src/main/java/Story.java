/**<h1>Story</h1>
 * <p>Write a program that asks the user for a character's name
 * and job. The program then prints a short story.
 */
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story,"
                + " but I need some information first.\n"
                + "What is the main character called?");

        String charName = scanner.nextLine();

        System.out.println("What is their job?");

        String charJob = scanner.nextLine();

        System.out.printf("Here is the story:\n"
                + "Once upon a time there was %1$s, who was a %2$s.\n"
                + "On the way to work, %1$s reflected on life.\n"
                + "Perhaps %1$s will not be a %2$s forever.", charName, charJob);

    }
}
