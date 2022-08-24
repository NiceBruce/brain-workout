package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.greetUser;
import static hexlet.code.Engine.gamePlay;

public class App {

    private static String[] gameMenu =
        {"Please enter the game number and press Enter.",
        "1 - Greet",
        "2 - Even",
        "3 - Calc",
        "4 - Gcd",
        "5 - Progression",
        "6 - Prime",
        "0 - Exit"};

    public static void printMenu() {
        for (var position : gameMenu) {
            System.out.println(position);
        }
    }

    public static int getUserChoice() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        boolean currentInput = false;
        int userChoice = 0;

        while (!currentInput) {
            try {
                userChoice = Integer.parseInt(scanner.next());
                currentInput = true;
            } catch (NumberFormatException e) {
                System.out.println("\n*****************\nEnter a number!\n*****************\n");
                System.out.print("Your choice: ");
            }
        }
        System.out.println();

        return userChoice;
    }

    public static void launchApp() {

        printMenu();

        switch (getUserChoice()) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                greetUser();
                break;
            case 2:
                gamePlay(greetUser(), "Even");
                break;
            case 3:
                gamePlay(greetUser(), "Calc");
                break;
            case 4:
                gamePlay(greetUser(), "GCD");
                break;
            case 5:
                gamePlay(greetUser(), "Progression");
                break;
            case 6:
                gamePlay(greetUser(), "Prime");
                break;
            default:
                System.out.println("Let's play! Choose a game!\n");
                launchApp();
                break;
        }
    }
    public static void main(String[] args) {
        launchApp();
    }
}
