package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Prime {

    private static final int MAX_NUMBER = 1000;
    public static boolean playRound() {

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Random random = new Random();
        int number = random.nextInt(MAX_NUMBER);
        System.out.println("Question: " + number);

        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();
        String correctAnswer = isPrime(number) ? "yes" : "no";

        if (answer.equalsIgnoreCase(correctAnswer)) {
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }

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
