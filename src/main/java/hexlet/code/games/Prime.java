package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int MAX_NUMBER = 1000;
    private static String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        String[][] questionsAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int number = Utils.getRandomInt(0, MAX_NUMBER);

            questionsAnswers[i][0] = String.valueOf(number);
            questionsAnswers[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.playGame(rules, questionsAnswers);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
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
