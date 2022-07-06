package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    private static final int MAX_START_VALUE = 50;
    private static final int MAX_STEP = 20;
    private static final int PROGRESSION_SIZE = 10;

    public static void start() {
        String rules = "What number is missing in the progression?";
        String[] questions = new String[Engine.NUMBER_OF_ROUNDS];
        String[] answers = new String[Engine.NUMBER_OF_ROUNDS];
        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int[] numbers = generateProgression();
            int indexOfMissingNumber = random.nextInt(numbers.length);

            questions[i] = questionText(numbers, indexOfMissingNumber);
            answers[i] = "" + numbers[indexOfMissingNumber];
        }
        Engine.playGame(rules, questions, answers);
    }

    private static int[] generateProgression() {
        int[] numbers = new int[PROGRESSION_SIZE];

        Random random = new Random();

        int step = random.nextInt(MAX_STEP);
        numbers[0] = random.nextInt(MAX_START_VALUE);

        for (int i = 1; i < PROGRESSION_SIZE; i++) {
            numbers[i] = numbers[i - 1] + step;
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
