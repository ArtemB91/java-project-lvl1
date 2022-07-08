package hexlet.code.games;

import hexlet.code.Engine;


public class GCD {
    private static final int MAX_NUMBER = 100;
    private static String rules = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[][] questionsAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int number1 = Utils.getRandomInt(MAX_NUMBER);
            int number2 = Utils.getRandomInt(MAX_NUMBER);

            questionsAnswers[i][0] = number1 + " " + number2;
            questionsAnswers[i][1] = String.valueOf(calcGcd(number1, number2));
        }
        Engine.playGame(rules, questionsAnswers);
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
