package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;



public class App {

    private static final int EXIT = 0;
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static String[] gameMenu =
        {"Please enter the game number and press Enter.",
            GREET + " - Greet",
            EVEN + " - Even",
            CALC + " - Calc",
            GCD + " - Gcd",
            PROGRESSION + " - Progression",
            PRIME + " - Prime",
            EXIT + " - Exit"};

    public static void printMenu() {
        for (var position : gameMenu) {
            System.out.println(position);
        }
    }

    public static int getUserChoice() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int userChoice = 0;

        try {
            userChoice = Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("\n****************************************************\n"
                    + "* You need to enter a game Number to play the game *"
                    + "\n****************************************************\n");
            System.exit(0);
        }

        System.out.println();

        return userChoice;
    }

    public static void launchApp() {

        printMenu();

        switch (getUserChoice()) {
            case EXIT:
                System.out.println("Bye!");
                break;
            case GREET:
                Cli.greetUser();
                break;
            case EVEN:
                Engine.start(new Even());
                break;
            case CALC:
                Engine.start(new Calc());
                break;
            case GCD:
                Engine.start(new Gcd());
                break;
            case PROGRESSION:
                Engine.start(new Progression());
                break;
            case PRIME:
                Engine.start(new Prime());
                break;
            default:
                System.out.println("\n****************************************************\n"
                        + "* You need to enter a game Number to play the game *"
                        + "\n****************************************************\n");
                break;
        }
    }

    public static void main(String[] args) {
        launchApp();
    }
}
