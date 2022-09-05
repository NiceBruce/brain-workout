package hexlet.code;

import hexlet.code.games.Games;
import java.util.Scanner;


public class Engine  {
    private static int countToWin = 0;
    private static final int WIN_CONDITION = 3;

    public static String greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
        return userName;
    };

    public static void start(Games game) {

        String userName = "";
        Scanner scanner = new Scanner(System.in);

        while (countToWin <= WIN_CONDITION) {

            String[] gameData = game.play();

            if (countToWin == 0) {
                userName = greetUser();
                String generalQuestion = gameData[0];
                System.out.println(generalQuestion);
            }

            String rightAnswer = gameData[2];
            String userAnswer = "";

            System.out.println("Question: " + gameData[1]);
            System.out.print("Your answer: ");
            userAnswer = scanner.next();

            if (userAnswer.equals(rightAnswer)) {

                System.out.println("Correct!");
                countToWin++;

                if (countToWin == WIN_CONDITION) {
                    System.out.println("Congratulations, " + userName + "!");
                    break;
                }

            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer is was '"
                                            + rightAnswer + "'. \nLet's try again, " + userName + "!");
                break;
            }
        }
    }
}
