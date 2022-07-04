package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    private static final int MAX_NUMBER = 100;

    public static boolean playRound() {

        Random random = new Random();

        int number1 = random.nextInt(MAX_NUMBER);
        int number2 = random.nextInt(MAX_NUMBER);

        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + number1 + " " + number2);

        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();
        int correctAnswer = calcGcd(number1, number2);

        if (answer == correctAnswer) {
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }

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
