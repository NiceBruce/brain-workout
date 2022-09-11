package hexlet.code;

import hexlet.code.games.Game;
import java.util.Scanner;


public class Engine  {
    private static int countToWin = 0;
    private static final int WIN_CONDITION = 3;

    public static void start(Game game) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(game.getGeneralQuestion());

        while (countToWin < WIN_CONDITION) {

            String[] gameData = game.getGameData();
            String rightAnswer = gameData[1];

            System.out.println("Question: " + gameData[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(rightAnswer)) {

                System.out.println("Correct!");
                countToWin++;

            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer is was '"
                                            + rightAnswer + "'. \nLet's try again, " + userName + "!");
                System.exit(0);
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
