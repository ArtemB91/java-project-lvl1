package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    private static final int MAX_NUMBER = 100;
    private static String[] operationTypes = {"+", "-", "*"};

    public static boolean playRound() {

        Random random = new Random();

        int number1 = random.nextInt(MAX_NUMBER);
        int number2 = random.nextInt(MAX_NUMBER);
        String operation = operationTypes[random.nextInt(operationTypes.length)];

        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + number1 + " " + operation + " " + number2);

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        int correctAnswer = calculate(number1, number2, operation);

        if (answer == correctAnswer) {
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }
    }

    public static int calculate(int number1, int number2, String operation) {
        switch (operation) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            default:
                return 0;
        }
    }


}
