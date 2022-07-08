package hexlet.code.games;

import hexlet.code.Engine;


public class Even {
    private static final int MAX_NUMBER = 1000;
    private static String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        String[][] questionsAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int number = Utils.getRandomInt(MAX_NUMBER);
            questionsAnswers[i][0] = String.valueOf(number);
            questionsAnswers[i][1] = (isEven(number)) ? "yes" : "no";
        }
        Engine.playGame(rules, questionsAnswers);
    }

    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
