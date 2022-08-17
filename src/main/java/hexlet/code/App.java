package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.greetUser;
import static hexlet.code.EvenGame.playEven;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] gameMenu = {"Please enter the game number and press Enter.", "1 - Greet", "2 - Even", "0 - Exit"};

        for (var position : gameMenu) {
            System.out.println(position);
        }

        System.out.print("Your choice: ");
        int userChoice = scanner.nextInt();
        System.out.println();

        switch (userChoice) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("Welcome to the Brain Games!");
                greetUser();
                break;
            case 2:
                System.out.println("Welcome to the Brain Games!");
                String userName = greetUser();
                playEven(userName);
            default:
                System.out.println(":]");
                break;
        }


    }
}
