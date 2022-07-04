package hexlet.code;

import java.util.Scanner;

public class App {

    private static final int GREET_CHOISE = 1;
    private static final int EVEN_CHOISE = 2;
    private static final int CALC_CHOISE = 3;
    private static final int GCD_CHOISE = 4;
    private static final int PROGRESSION_CHOISE = 5;
    private static final int PRIME_CHOISE = 6;

    public static void main(String[] args) {

        printMenu();

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.println("Your choice: " + choice);

        switch (choice) {
            case GREET_CHOISE:
                Cli.greet();
                break;
            case EVEN_CHOISE:
                Engine.playGame(Engine.Game.EVEN);
                break;
            case CALC_CHOISE:
                Engine.playGame(Engine.Game.CALC);
                break;
            case GCD_CHOISE:
                Engine.playGame(Engine.Game.GCD);
                break;
            case PROGRESSION_CHOISE:
                Engine.playGame(Engine.Game.PROGRESSION);
                break;
            case PRIME_CHOISE:
                Engine.playGame(Engine.Game.PRIME);
                break;
            default:
                break;
        }

    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }
}
