package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    private static final int MAX_NUMBER = 1000;

    public static void start() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[Engine.NUMBER_OF_ROUNDS];
        String[] answers = new String[Engine.NUMBER_OF_ROUNDS];
        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int number = random.nextInt(MAX_NUMBER);

            questions[i] = "" + number;
            answers[i] = isPrime(number) ? "yes" : "no";
        }
        Engine.playGame(rules, questions, answers);
    }

    private static boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
