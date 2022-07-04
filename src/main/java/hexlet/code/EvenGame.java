package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    private static String playerName;
    private static final int NUMBER_OF_TRIES = 3;

    public static void playEvenGame() {

        greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_TRIES; i++) {

            int number = random.nextInt();
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            System.out.println("Question : " + number);

            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + playerName);
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }

    public static void greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String name = scanner.nextLine();
        playerName = name;

        System.out.println("Hello, " + name + "!");
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String name) {
        EvenGame.playerName = name;
    }
}
