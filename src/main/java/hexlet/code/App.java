package hexlet.code;

import java.util.Scanner;

public class App {

    private static final int GREET_CHOISE = 1;
    private static final int EVEN_CHOISE = 2;
    private static final int CALC_CHOISE = 3;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

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
            default:
                break;
        }

    }
}
