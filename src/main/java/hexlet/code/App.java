package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    private static final int GREET_CHOISE = 1;
    private static final int EVEN_CHOISE = 2;
    private static final int CALC_CHOISE = 3;
    private static final int GCD_CHOISE = 4;
    private static final int PROGRESSION_CHOISE = 5;
    private static final int PRIME_CHOISE = 6;
    private static final int EXIT_CHOISE = 0;


    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.println("Your choice: " + choice);

        switch (choice) {
            case GREET_CHOISE:
                Cli.greet();
                break;
            case EVEN_CHOISE:
                Even.start();
                break;
            case CALC_CHOISE:
                Calc.start();
                break;
            case GCD_CHOISE:
                GCD.start();
                break;
            case PROGRESSION_CHOISE:
                Progression.start();
                break;
            case PRIME_CHOISE:
                Prime.start();
                break;
            case EXIT_CHOISE:
                break;
            default:
                System.out.println("You entered the wrong number");
                break;
        }
        scanner.close();
    }

}
