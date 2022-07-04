package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {

    private static final int MAX_START_VALUE = 50;
    private static final int MAX_STEP = 20;
    private static final int PROGRESSION_SIZE = 10;



    public static boolean playRound() {

        int[] numbers = generateProgression();

        Random random = new Random();
        int indexOfMissingNumber = random.nextInt(numbers.length);

        StringBuilder builder = new StringBuilder("Question: ");
        for (int i = 0; i < numbers.length; i++) {
            if (i == indexOfMissingNumber) {
                builder.append(".. ");
            } else {
                builder.append(numbers[i]);
                builder.append(" ");
            }
        }

        System.out.println("What number is missing in the progression?");
        System.out.println(builder.toString());

        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();
        int correctAnswer = numbers[indexOfMissingNumber];

        if (answer != correctAnswer) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }

        return true;

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
}
