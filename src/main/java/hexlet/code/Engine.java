package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    private static String playerName;
    public static void greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String name = scanner.nextLine();
        playerName = name;

        System.out.println("Hello, " + name + "!");
    }
    public static void playGame(String rules, String[][]questionsAnswers) {

        Scanner scanner = new Scanner(System.in);

        greet();
        System.out.println(rules);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            String question = questionsAnswers[i][0];
            String correctAnswer = questionsAnswers[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                scanner.close();
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + playerName + "!");
        scanner.close();
    }

}
