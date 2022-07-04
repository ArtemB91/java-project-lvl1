package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static boolean playRound() {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt();
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";

        System.out.println("Question: " + number);

        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase(correctAnswer)) {
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }
    }

    public static void greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }

}
