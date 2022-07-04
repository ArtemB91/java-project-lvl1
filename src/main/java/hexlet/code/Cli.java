package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String playerName;
    public static void greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String name = scanner.nextLine();
        playerName = name;

        System.out.println("Hello, " + name + "!");
    }

    public static String getPlayerName() {
        return playerName;
    }
}
