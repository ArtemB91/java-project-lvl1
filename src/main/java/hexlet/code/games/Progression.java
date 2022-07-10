package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int MAX_START_VALUE = 50;
    private static final int MAX_STEP = 20;
    private static final int MIN_PROGRESSION_SIZE = 5;
    private static final int MAX_PROGRESSION_SIZE = 20;
    private static String rules = "What number is missing in the progression?";

    public static void start() {
        String[][] questionsAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int firstElement = Utils.getRandomInt(0, MAX_START_VALUE);
            int step = Utils.getRandomInt(0, MAX_STEP);
            int size = Utils.getRandomInt(MIN_PROGRESSION_SIZE, MAX_PROGRESSION_SIZE);

            int[] numbers = generateProgression(firstElement, size, step);
            int indexOfMissingNumber = Utils.getRandomInt(0, numbers.length);

            questionsAnswers[i][0] = questionText(numbers, indexOfMissingNumber);
            questionsAnswers[i][1] = String.valueOf(numbers[indexOfMissingNumber]);
        }
        Engine.playGame(rules, questionsAnswers);
    }

    private static int[] generateProgression(int firstElement, int size, int step) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = firstElement + step * i;
        }
        return numbers;
    }

    private static String questionText(int[] numbers, int indexOfMissingNumber) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i == indexOfMissingNumber) {
                builder.append(".. ");
            } else {
                builder.append(numbers[i]);
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
