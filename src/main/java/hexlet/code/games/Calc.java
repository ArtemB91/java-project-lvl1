package hexlet.code.games;

import hexlet.code.Engine;


public class Calc {

    private static final int MAX_NUMBER = 100;
    private static String rules = "What is the result of the expression?";
    private static final String[] OPERATION_TYPES = {"+", "-", "*"};

    public static void start() {
        String[][] questionsAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int number1 = Utils.getRandomInt(MAX_NUMBER);
            int number2 = Utils.getRandomInt(MAX_NUMBER);
            String operation = OPERATION_TYPES[Utils.getRandomInt(OPERATION_TYPES.length)];

            questionsAnswers[i][0] = number1 + " " + operation + " " + number2;
            questionsAnswers[i][1] = String.valueOf(calculate(number1, number2, operation));
        }
        Engine.playGame(rules, questionsAnswers);
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
                throw new RuntimeException("Invalid operation! Operation should be +, - or *");
        }
    }

}
