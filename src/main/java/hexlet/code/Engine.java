package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static void playGame(String rules, String[] questions, String[] answers) {
        Scanner scanner = new Scanner(System.in);

        Cli.greet();
        System.out.println(rules);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            String question = questions[i];
            String correctAnswer = answers[i];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getPlayerName() + "!");
                scanner.close();
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + Cli.getPlayerName() + "!");
        scanner.close();
    }

}
