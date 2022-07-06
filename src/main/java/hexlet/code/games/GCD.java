package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[Engine.NUMBER_OF_ROUNDS];
        String[] answers = new String[Engine.NUMBER_OF_ROUNDS];
        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int number1 = random.nextInt(MAX_NUMBER);
            int number2 = random.nextInt(MAX_NUMBER);

            questions[i] = "" + number1 + " " + number2;
            answers[i] = "" + calcGcd(number1, number2);
        }
        Engine.playGame(rules, questions, answers);
    }

    private static int calcGcd(int number1, int number2) {

        if (number2 == 0) {
            return 0;
        }

        int remainder = number1 % number2;

        if (remainder == 0) {
            return number2;
        } else {
            return calcGcd(number2, remainder);
        }
    }
}
