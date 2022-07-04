package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

public class Engine {

    private static final int NUMBER_OF_TRIES = 3;
    public enum Game {
        EVEN, CALC, GCD, PROGRESSION
    }

    public static void playGame(Game game) {
        Cli.greet();

        boolean success;

        for (int i = 0; i < NUMBER_OF_TRIES; i++) {

            success = false;

            switch (game) {
                case EVEN:
                    success = Even.playRound();
                    break;
                case CALC:
                    success = Calc.playRound();
                    break;
                case GCD:
                    success = GCD.playRound();
                    break;
                case PROGRESSION:
                    success = Progression.playRound();
                    break;
                default:
                    break;
            }

            if (success) {
                System.out.println("Correct!");
            } else {
                System.out.println("Let's try again, " + Cli.getPlayerName());
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.getPlayerName() + "!");
    }
}
