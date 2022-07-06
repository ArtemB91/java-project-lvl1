package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    private static final int MAX_NUMBER = 100;
    private static final String[] OPERATION_TYPES = {"+", "-", "*"};

    public static void start() {
        String rules = "What is the result of the expression?";
        String[] questions = new String[Engine.NUMBER_OF_ROUNDS];
        String[] answers = new String[Engine.NUMBER_OF_ROUNDS];
        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int number1 = random.nextInt(MAX_NUMBER);
            int number2 = random.nextInt(MAX_NUMBER);
            String operation = OPERATION_TYPES[random.nextInt(OPERATION_TYPES.length)];

            questions[i] = "" + number1 + " " + operation + " " + number2;
            answers[i] = "" + calculate(number1, number2, operation);
        }
        Engine.playGame(rules, questions, answers);
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
