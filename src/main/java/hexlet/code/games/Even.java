package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    public static void start() {

        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[Engine.NUMBER_OF_ROUNDS];
        String[] answers = new String[Engine.NUMBER_OF_ROUNDS];

        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int number = random.nextInt();
            questions[i] = "" + number;
            answers[i] = (number % 2 == 0) ? "yes" : "no";
        }

        Engine.playGame(rules, questions, answers);

    }

}
